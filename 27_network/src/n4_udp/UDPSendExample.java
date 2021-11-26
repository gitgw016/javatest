package n4_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UDPSendExample {

	public static void main(String[] args) {
		try {
			// 전달할 데이터 정보와 전달될 위치 정보를 가지고 data를 전송하는 역할
			DatagramSocket datagramSocket = new DatagramSocket();
			
			for(int i=0; i<3; i++){
				String message = " message - 배민구" + i;
				byte[] bytes = message.getBytes();		//전달될데이터 / 데이터 크기 / 데이터 위치
				DatagramPacket packet = new DatagramPacket(bytes,bytes.length,new InetSocketAddress("192.168.1.176",5001));
				datagramSocket.send(packet);
				System.out.println("보낸 바이트 수 : "+bytes.length+"bytes");
			}
			System.out.println("다보냈다.");
			datagramSocket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
