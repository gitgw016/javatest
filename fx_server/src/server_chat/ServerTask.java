package server_chat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Hashtable;

// 연결된 client와 통신을 진행할 작업 Task
public class ServerTask implements Runnable {
	
	Socket client;						// 현재 연결된 client의 연결 정보
	Hashtable<String,PrintWriter> ht;	// 현재 연결된 모든 사용자의 정보
	ServerController sc;				// display가 있는 controller
	
	PrintWriter pw;			// 연결된 client로 출력
	BufferedReader br;		// 연결된 client에서 메세지 받기
	
	String nickName ;		// 현재 연결된 사용자의 nickName
	
	boolean isRun = true;	// receive Thread flag
	
	public ServerTask(Socket client, Hashtable<String,PrintWriter> ht, ServerController sc) {
		this.client = client;
		this.ht = ht;
		this.sc = sc;
		
		try {
			OutputStream os = client.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			pw = new PrintWriter(bw,true);
			
			InputStream is = client.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
		} catch (IOException e) {
			sc.displayText("Client? : "+e.getMessage());
		}
		
	}

	// receive - 데이터 전달 받기
	@Override
	public void run() {
		System.out.println("Client에서 receive 시작");
		while(isRun) {
			try {
				String receiveData = br.readLine();
				if(receiveData == null) {
					isRun = false;
				}
				System.out.println(receiveData);
				
				String[] data = receiveData.split("\\|");
				// 0|nickname		 1|message
				//[0,nickname]		[1|message]
				String code = data[0];
				String text = data[1];
				switch(code) {
					case "0" :
						// hashtable에 client정보 등록
						// 이미 존재하는 닉네임으로 연결 요청 할 시
						if(ht.containsKey(text)) {
							// client에 사용할 수 없는 닉네임  메세지 전달
							this.pw.println("1|사용 불가, 다시하라");
							sc.displayText(text+" - 사용 불가");
							isRun = false;
							client.close();
							break;
						}
						
						nickName = text;
						ht.put(text, pw);
						String sendData = "";
						for(String s : ht.keySet()) {
							sendData += s+",";
						}
						// 0|닉네임,닉네임,닉네임,닉네임
						broadCast(0,sendData);
						broadCast(1,text+"이(가) 입장했다. 총인원 : "+ht.size());
						
						break;
					case "1" :
						// message 전달
						// /w 문자열로 시작하면 true
						if(text.startsWith("/w")) {
							// /w 닉네임 메세지
							int begin = text.indexOf(" ")+1;
							// 두번째 매개변수 인덱스 위치 부터
							// 첫번째 매개변수 글자가 어디있는지 인덱스 번호 검색
							int end = text.indexOf(" ",begin);
							 if(begin != -1 && end != -1) {
								 String nick = text.substring(begin,end);
								 String message = text.substring(end);
								 PrintWriter pw = ht.get(nick);
								 if(pw != null) {
									 // 사용자 존재
									 pw.println("1|"+this.nickName+"의 귓속말 : "+message);
								 }else {
									 // 사용자가 없다
									 this.pw.println("1|"+nick+"은(는) 없는놈이다.");
								 }
							 }
						}else {
						broadCast(1,nickName+" : "+text);
						}
						break;
				}
			} catch (IOException e) {
				System.out.println("client 연결?");
				isRun = false;
			}
		}
		
		if(client != null && !client.isClosed()) {
			try {
				client.close();
			} catch (IOException e) {}
		}
		
		ht.remove(nickName);
		String list ="";
		for(String s : ht.keySet()) {
			list+= s+",";
			System.out.println(list);
		}
		broadCast(0,list);
		broadCast(1,nickName+"이(가) 나갔다. 방인원 : "+ht.size());
	}
	
	// 연결된 모든 client에 메세지 전달
	public void broadCast(int code, String message) {
		for(PrintWriter p : ht.values()) {
			p.println(code+"|"+message);
		}
	}

}
