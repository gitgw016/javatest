package t01_create_thread;

import java.awt.Toolkit;

public class SingleThread {

	// Main Thread - 생성
	public static void main(String[] args) {
		System.out.println("Main 시작");
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		toolkit.beep(); // 운영체제의 사운드 소리 출력
		
		for(int i=0; i<5; i++) {
			System.out.println("명!");
			try {
				Thread.sleep(500);				// 위의 실행문을 실행 한 후 메인 스레드를 일정시간동안 정지(ms 단위)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("==================================");
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Main 종료");
	}
	// Main Thread - 종료
}
