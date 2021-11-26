package d.phone;

public class Phone {
	String model;
	String color;
	
	
	
	public Phone() {}

	public Phone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	
	void powerOn() {
		System.out.println("전원 부팅");
	}
	
	void powerOff() {
		System.out.println("전원 끄기");
	}
	
	void bell() {
		System.out.println("벨 on");
	}
	
	void take() {
		System.out.println("전화 수화");
	}
	
	void hangUp() {
		System.out.println("전화 종료");
	}
	
	void sendVoice(String message) {
		System.out.println("나 : "+message);
	}
	
	void receiveVoice(String message) {
		System.out.println("상대방 : " + message);
	}
}
