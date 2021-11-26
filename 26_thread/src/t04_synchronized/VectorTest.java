package t04_synchronized;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		//List<String> array = new ArrayList<>(); 		// arraylist는 thread사용 시 위험하다. (t1,t2 겹침으로 오류 및 값 비정상 삽입 등)
		List<String> array = new Vector<>();			// vector는 자체적으로 synchronized가 내장되어있다. (thread에 안전)
		Thread t1 = new Thread(()->{
			for(int i=0; i<10000; i++) {
				array.add("배민구");
			}
		}) ;

		
		Thread t2 = new Thread(()->{
			for(int i=0; i<10000; i++) {
				array.add("안섬");
			}
		});
		t1.start();
		t2.start();
		Thread t3 = new Thread(()->{
			while(true) {
				Thread.State state1 = t1.getState();
				Thread.State state2 = t2.getState();
				if(state1 == Thread.State.TERMINATED && state2 == Thread.State.TERMINATED) {
					System.out.println("t1, t2 끝");
					System.out.println("array : "+array.size());
					break;
				}
			}
		});
		t3.start();

	}

}
