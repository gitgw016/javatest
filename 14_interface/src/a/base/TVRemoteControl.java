package a.base;

public class TVRemoteControl implements RemoteControl {
	
	int volume = 1;

	@Override
	public void turnOff() {
		System.out.println("TV를 끈다.");
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켠다");
	}

	@Override
	public void setValue(int value) {
		if(value >= RemoteControl.MIN_VALUE) {
		this.volume = value;
		System.out.println(this.volume+"으로 음량을 설정한다.");
		}
	}

}
