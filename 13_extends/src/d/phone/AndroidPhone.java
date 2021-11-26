package d.phone;

public class AndroidPhone extends DmbPhone{
	String url;

	public AndroidPhone(String model, String color, int channel, String url) {
		super(model, color, channel);
		this.url = url;
	}

	@Override
	void sendVoice(String message) {
		super.sendVoice(message);
	}

	@Override
	void receiveVoice(String message) {
		super.receiveVoice(message);
	}
	
	
	
}
