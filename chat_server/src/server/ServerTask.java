package server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerTask implements Runnable {
	// 현재 task에 등록된 client 정보
	Socket client;
	
	// client에게 메세지를 전달할 스트림
	PrintWriter pw;
	// client에게 메세지를 전달받을 스트림
	BufferedReader br;
	// 현재 작업의 사용자 ID
	String userID;

	// server로 부터 accept된 Client의 Socket정보를 생성자의 매개변수로 전달 받음.
	public ServerTask(Socket client) {
		this.client = client;
		try {
			pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(client.getOutputStream())), true); // true : auto flush()
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			ChatServer.serverPool.submit((Runnable) () -> {
					while(true) {
						System.out.println("ID 입력대기");
						try {
							userID = br.readLine();
						} catch (IOException e) {}
						System.out.println(userID);
						if(userID.trim().equals("") || ChatServer.ht.containsKey(userID)) {
							pw.println("이미 있는 아이디다.");
							System.err.println(userID+" 못쓴다.");
							continue;
						}
						ChatServer.ht.put(userID, pw);
						broadCast(userID+"가 입장했다. 총인원 : "+ChatServer.ht.size());
						ChatServer.serverPool.submit(this);
						break;
				}
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// message를 전달 받아 연결된 모든 사용자에게 메세지 전달
	public void broadCast(String message) {
		// hashtable value 묶음을 가지고 와서 순회하면서 출력
		for(PrintWriter p : ChatServer.ht.values()) {
			if(this.pw != p) {
				p.println(message);	
			}
		}
		// server console에 출력
		System.out.println(message);
	}
	
	// send(귓속말)
	// /w 아이디 메세지
	public void sendMsg(String message) {
		int begin = message.indexOf(" ")+1;
		int end = message.indexOf(" ", begin);
		if(end != -1) {
			String id = message.substring(begin,end);
			String msg = message.substring(end);
			PrintWriter pw = ChatServer.ht.get(id);
			if(pw != null) {
				// 사용자 존재
				pw.println(userID+"의 말 : "+msg);
			}else {
				// 사용자 없음
				this.pw.println(id+" 없다.");
			}
		}
	}

	// receive
	@Override
	public void run() {
		while(true) {
			/*
			 *  /quit -> 종료
			 *  /w 아이디 메세지 -> 귓속말
			 *  나머지는 전체
			 */
			try {
				String receiveData = br.readLine();
				if(receiveData.trim().equals("/quit")) {
					break;
				}else if(receiveData.indexOf("/w") > -1) {
					sendMsg(receiveData);
				}else {
					broadCast(userID+" : "+receiveData);
				}
			} catch (IOException e) {
				System.out.println("-클- 오류");
				break;
			}
		}
		// 종료한 사용자 정보 hashtable에서 삭제
		ChatServer.ht.remove(userID);
		broadCast(userID+"가 나갔다. 총인원 : "+ChatServer.ht.size());
	}

}
