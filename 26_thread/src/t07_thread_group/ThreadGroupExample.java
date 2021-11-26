package t07_thread_group;

public class ThreadGroupExample {

	public static void main(String[] args) {
		ThreadGroup group = new ThreadGroup("MyGroup");
		Thread threadA = new WorkThread(group, "WorkThreadA");
		Thread threadB = new WorkThread(group, "WorkThreadB");
		Thread threadC = new Thread(group, new Runnable() {
			@Override
			public void run() {
				while(true) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("ThreadC thread Interrupted");
						break;
					}
				}
				System.out.println("ThreadC 종료");
			}
		});
		
		threadA.start();
		threadB.start();
		threadC.start();
		
		System.out.println("[ main thread 그룹 list 정보 ]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		// ThreadGroup의 리스트 정보를 출력하는 method
		mainGroup.list();
		System.out.println();
		
		System.out.println("[ MyGroup 그룹 list 정보 ]");
		group.list();
		System.out.println();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		System.out.println("MyGroup Thread group interrupt() 호출");
		// group.interrupt();
		mainGroup.interrupt();
	}

}
