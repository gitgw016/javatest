package n2_socket_serverSocket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientExample {

	public static void main(String[] args) {
		System.out.println("--서버에 연결 요청--");
		// 연결 요청을 보낼 ip와 port번호
		try {
			Socket socket = new Socket("192.168.1.176",5001);
			System.out.println("☆★서버 연결 완료★☆");
			System.out.println(socket.getRemoteSocketAddress());
			
			OutputStream os = socket.getOutputStream();
			String message = "배민구 = 홍재관";
			byte[] bytes = message.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println("데이터 전송 끝^^");
			// 항상 서버가 먼저 실행되어야 접속 가능
			
			InputStream is = socket.getInputStream();
			bytes = new byte[1000];
			// 서버쪽에서 출력될때까지 blocking
			int readCount = is.read(bytes);
			message = new String(bytes,0,readCount,"UTF-8");
			System.out.println("서버에서 받음^^ \n" + message);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
