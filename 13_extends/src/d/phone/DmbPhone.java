package d.phone;

public class DmbPhone extends Phone{
	
	int channel;
	
	public DmbPhone() {
		super();
	}
	
	public DmbPhone(String model, String color, int channel) {
		super(model,color);
		/*
		super.model = model;
		super.color = color;
		*/
		this.channel = channel;
	}
	
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널 : " + this.channel+"로 변경");
	}
	
	void turnOnDmb() {
		System.out.println("DMB on");
	}
	
	void turnOffDmb() {
		System.out.println("Dmb off");
	}
}
