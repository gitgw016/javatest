package a.base;

public class SmartTVRemoteControl implements RemoteControl, Searchable{
	
	int volume;
	
	@Override
	public void turnOff() {
		System.out.println("smartTV off");
	}

	@Override
	public void turnOn() {
		System.out.println("smartTV on");
	}

	@Override
	public void setValue(int value) {
		//if(value >= MIN_VALUE) {
		if(value >= RemoteControl.MIN_VALUE) {
		this.volume = value;
		System.out.println("change smartTV volume : "+volume);
		}
	}

	@Override
	public void search(String word) {
		System.out.println("Searching "+word);
	}

}
