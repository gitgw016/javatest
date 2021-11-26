package n2_socket_serverSocket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {

	public static void main(String[] args) {
		try {
			// ServerSocket server = new ServerSocket(5001);
			ServerSocket server = new ServerSocket();
			server.bind(new InetSocketAddress("192.168.1.176",5001));
			System.out.println("--서버 열림--");
			System.out.println("client 연결 대기");
			Socket client = server.accept();
			
			InputStream is = client.getInputStream();
			String message = "";
			byte[] bytes = new byte[100];
			// blocking
			int readCount = is.read(bytes);
			message = new String(bytes,0,readCount,"UTF-8");
			System.out.println(client + "데이터 받음^^ \n"+ message);
			
			OutputStream os = client.getOutputStream();
			message = "오정만 = 배민구";
			bytes = message.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println("client로 전송 완료^^");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("main 끝");
	}

}
