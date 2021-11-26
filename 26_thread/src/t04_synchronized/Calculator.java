package t04_synchronized;

public class Calculator {
	
	private int memory;

	public int getMemory() {
		return memory;
	}

	//public synchronized void setMemory(int memory)
	public void setMemory(int memory){
		synchronized (this) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		// 현재 동작중인 스레드 정보 Thread.currentThread()
		String name = Thread.currentThread().getName();
		System.out.println(name+" : "+this.memory);
		}
	}
	
}
