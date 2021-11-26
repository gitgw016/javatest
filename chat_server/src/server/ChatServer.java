package server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Hashtable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatServer {
	
	public static final String IP = "192.168.1.176";
	public static final int PORT = 5001;
	
	ServerSocket serverSocket; // client 연결 수락 및 정보 확인
	
	// client들의 정보 저장
	// id(key) , 출력 스트림(value)
	static Hashtable<String,PrintWriter> ht;
	
	// thread pool
	static ExecutorService serverPool;
	
	public ChatServer() {
		try {
			serverPool = Executors.newFixedThreadPool(30);
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress(IP,PORT));
		} catch (IOException e) {
			System.out.println("bind 불가능 IP or PORT. "+e.getMessage());
			return;
		}
		
		ht = new Hashtable<>();
		System.out.println("ㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ채팅하라ㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ");
		while(true) {
			try {
				System.out.println("--연결 기다림--");
				Socket client = serverSocket.accept();
				String clientIP = client.getInetAddress().getHostAddress();
				System.out.println(clientIP+" - 연결 수락");
				new ServerTask(client);
			} catch (IOException e) {
				System.out.println("Server 안됨 : "+e.getMessage());
				ht.clear();
				serverPool.shutdownNow();
				if(serverSocket != null && !serverSocket.isClosed()) {
					try {
						serverSocket.close();
					} catch (IOException e1) {}
				}
				break;
			}
		}
	}

	public static void main(String[] args) {
		new ChatServer();
	}

}
