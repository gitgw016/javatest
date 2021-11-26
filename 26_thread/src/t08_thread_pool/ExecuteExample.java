package t08_thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecuteExample {

	public static void main(String[] args) {
		// 초기 스레드 수 : ExecutorService 객체가 생성될때 기본적으로 생성되는 스레드 수
		// 코어 스레드 수 : 스레드가 증가한 후 사용되지 않는 스레드를 스레드 풀에서 제거하지 않고 최소한으로 유지할 갯수
		// 최대 스레드 수 : 스레드 풀에서 관리하는 최대 스레드 수
		/*
		 * newCachedThreadPool()
		 * 초기 스레드 수, 코어 스레드 수는 0개 최대 스레드 수는 Integer.MAX_VALUE
		 * 스레드 갯수보다 작업 갯수가 많으면 새로운 스레드를 생성햐여 작업 처리
		 * 만약 일이없는 스레드가 60초 동안 유지되면 스레드를 종료시키고 제거
		 * 
		 * newFixedThreadPool(int nThreads)
		 * 초기 스레드 수는 0개 코어 스레드 수와 최대 스레드 수를 nThreads값으로 지정
		 */
		// java.util.concurrent.*
		ExecutorService exe = Executors.newFixedThreadPool(3);
		for(int i=0; i<16; i++) {
			Runnable run = new Runnable() {
				@Override
				public void run() {
					ThreadPoolExecutor tpe = (ThreadPoolExecutor)exe;
					int poolSize = tpe.getPoolSize();
					String threadName = Thread.currentThread().getName();
					System.out.println("[ 총 스레드 수  : "+poolSize+"] 작업스레드 이름 : "+threadName);
					//int i =Integer.parseInt("일");
				}
			};
			// 다쓴 스레드는 버림.
			// 결과값을 반환하지 않기 때문에 오류가 발생하면 처리가 없음
			//exe.execute(run);
			
			// 스레드를 재사용
			// 오류나 반환타입에 대한 결과를 반환
			// 오류에 대한 처리가 이루어짐
			exe.submit(run);
			/*
			if(i == 10) {
				exe.shutdown();
			}
			*/
		}
		
		exe.execute(new Runnable() {
			@Override
			public void run() {
				System.out.println("추가된 작업");
			}
		});
		// 이미 시작된 작업은 실행하고, 새로운 작업은 추가하지 않음
		//exe.shutdown();
		
		try {
			exe.awaitTermination(10, TimeUnit.SECONDS);
		} catch (InterruptedException e) {}
		System.out.println("기다림 끝");
		
		// 모든 task 강제 종료
		exe.shutdownNow();
	}


}
