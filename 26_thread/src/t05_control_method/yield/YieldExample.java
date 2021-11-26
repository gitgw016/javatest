package t05_control_method.yield;

class ThreadA extends Thread{
	boolean stop = true;	// 스레드 종료 flag
	boolean work = true;	// 작업실행 flag
	
	public void run() {
		while(stop) {
			try {
				Thread.sleep(500);
				if(work) {
					System.out.println("ThreadA ...");
				}else {
					// 우선순위가 동일한 스레드에 실행을 양보
					Thread.yield();
				}
			} catch (InterruptedException e) {}
		}
		System.out.println("ThreadA 끝");
	}
}

class ThreadB extends Thread{
	boolean stop = true;	// 스레드 종료 flag
	boolean work = true;	// 작업실행 flag
	
	public void run() {
		while(stop) {
			try {
				Thread.sleep(500);
				if(work) {
					System.out.println("ThreadB ...");
				}else {
					// 우선순위가 동일한 스레드에 실행을 양보
					Thread.yield();
				}
			} catch (InterruptedException e) {}
		}
		System.out.println("ThreadB 끝");
	}
}

public class YieldExample {

	public static void main(String[] args) throws InterruptedException {
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		
		a.start();
		b.start();
		
		Thread.sleep(2000);
		
		a.work = false;
		
		Thread.sleep(2000);
		
		a.work = true;
		b.work = false;
		
		Thread.sleep(2000);
		
		a.stop = false;
		b.stop = false;
		
		System.out.println(Thread.currentThread().getName()+" 끝");
	}

}
