package a.base;

public interface RemoteControl {
	public static final int MAX_VALUE = 10;
	// public static final 생략
	int MIN_VALUE = 0;
	
	public abstract void turnOff();
	public abstract void turnOn();
	void setValue(int value);
	/*
	public void setValue(int value) {}
	*/
}
