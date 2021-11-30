package push_man.main;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;

import push_man.vo.MemberVO;

public class Client {
	
	Socket client;
	// 로그인 완료된 회원 정보
	MemberVO member;

	public Client(Socket client) {
		this.client = client;
		serverClientReceive();
	}
	
	// client에서 출력되는 정보를 읽어들임
	public void serverClientReceive() {
		MainController.threadPool.submit(new Runnable() {
			@Override
			public void run() {
				ObjectInputStream ois = null;
				try {
				Object obj;
				while(true) {
						ois = new ObjectInputStream(client.getInputStream());
						if((obj = ois.readObject()) != null) {
							System.out.println("요청");
							if(obj instanceof MemberVO) {
								System.out.println("회원관련 요청");
								desposeMember((MemberVO)obj);
							}
						}
					} 
					}catch (Exception e) {
						removeClient();
				}
			}
		});
	}
	// 회원관련 요청 처리
	public void desposeMember(MemberVO obj) {
		System.out.println("receive MemberVO" +obj);
		switch(obj.getOrder()) {
			case 0 :
				// 아이디 중복 체크
				String memberId = obj.getMemberId();
				boolean isCheck = MainController.memberDAO.checkId(memberId);
				obj.setSuccess(isCheck);
				break;
			case 1 :
				// 회원가입
				MainController.mc.appendText("회원가입 요청 : "+obj.getMemberName());
				isCheck = MainController.memberDAO.joinMmeber(obj);
				obj.setSuccess(isCheck);
				break;
			case 2 :
				// 로그인
				MemberVO vo = MainController.memberDAO.loginMember(obj);
				if(vo.isSuccess()) {
					// 회원 정보 등록
					member = obj = vo;
					System.out.println("Login : "+member);
				}
				break;
		}
		System.out.println("send memberVO : "+obj);
		sendData(obj);
	}

	// 연결되어 있는 client에 정보를 출력
	public synchronized void sendData(Object data) {
		ObjectOutputStream oos = null;
		try {
			OutputStream os = client.getOutputStream();
			oos = new ObjectOutputStream(os);
			oos.writeObject(data);
			oos.flush();
		} catch (IOException e) {
			removeClient();
		}
	}
	
	// client 연결 종료
	public void removeClient() {
		String ip = client.getInetAddress().getHostAddress();
		MainController.mc.appendText(new Date()+ip+"연결 종료");
		System.out.println("Client 연결 종료 : "+ip);
		
		synchronized (MainController.clients) {
			MainController.clients.remove(this);	
		}
		if(client != null && !client.isClosed()) {
			try {
				client.close();
			} catch (IOException e) {}
		}
	}
	
}
