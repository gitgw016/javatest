package a.base;

public class AirRemoteControl implements RemoteControl {
	
	int temperature = 24;

	@Override
	public void turnOff() {
		System.out.println("에어컨 off");
	}

	@Override
	public void turnOn() {
		System.out.println("에어컨 on");
	}

	@Override
	public void setValue(int value) {
		temperature = value;
		System.out.println(temperature+"C로 온도 설정");
	}
}
