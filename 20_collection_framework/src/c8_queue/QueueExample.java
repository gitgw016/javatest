package c8_queue;

import java.util.LinkedList;
import java.util.Queue;

class Message{
	// 명령
	String name;
	// 받는 이
	String to;
	
	public Message(String name, String to) {
		this.name = name;
		this.to = to;
	}

	@Override
	public String toString() {
		return "Message [name=" + name + ", to=" + to + "]";
	}
	
}

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<>();
		// queue에 데이터를 저장
		messageQueue.offer(new Message("sendMail","배민구"));
		messageQueue.offer(new Message("sendSMS","오정만"));
		messageQueue.offer(new Message("sendKaTalk","홍재관"));
		System.out.println(messageQueue.size());
		Message m = messageQueue.peek();
		System.out.println(m);
		System.out.println(messageQueue.size());
		
		while(!messageQueue.isEmpty()) {
			// queue에 들어간 순서에 따라 순차적으로 데이터를 꺼내옴
			// FIFO
			m = messageQueue.poll();
			System.out.println(m.to+"에게 "+m.name);
			System.out.println(messageQueue.size());
		}
		System.out.println(messageQueue.isEmpty());
	}
}
