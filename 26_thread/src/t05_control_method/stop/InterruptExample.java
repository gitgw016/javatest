package t05_control_method.stop;

class InterruptThread extends Thread{
	
	public void run() {
		while(true) {
			if(Thread.interrupted()) {
				break;
			}
			System.out.println("실행중");
		}
		System.out.println("자원해제");
		System.out.println("실행종료");
	}
	/*
	public void run() {
		while(true) {
			System.out.println("실행중");
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.out.println("Thread 종료");
				break;
			}
		}
		System.out.println("자원해제");
		System.out.println("실행종료");
		
	}
	*/
}

public class InterruptExample {

	public static void main(String[] args) {
		InterruptThread t = new InterruptThread();
		t.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		t.interrupt();
		
	}

}
