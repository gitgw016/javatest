package t03_state;

public class TargetThread extends Thread {
	public void run() {
		// RUNNABLE
		for(long i=0; i<10000000L; i++) 
			try {
				Thread.sleep(1500); // TIMED_WATING
			} catch (InterruptedException e) {}
			// RUNNABLE
		for(long i=0; i<10000000L; i++);
		// TERMINATED
	}
}
