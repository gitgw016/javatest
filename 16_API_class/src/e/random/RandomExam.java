package e.random;

import java.util.Random;

public class RandomExam {

	public static void main(String[] args) {
		int[] selectNumber = new int[6];
		// random class가 생성되어 실행 될때마다 시드값이 동일하면 동일한 난수를 발생
		Random random = new Random(10);
		// 정수형 난수 발생
		for(int i=0; i<selectNumber.length; i++){
			selectNumber[i] = random.nextInt(45)+1;
			System.out.print(selectNumber[i]+ " ");
		}
		System.out.println();
		
		Random random5 = new Random(5);
		for(int i=0; i<6; i++) {
			System.out.print(random5.nextInt(45)+1+" ");
		}
		System.out.println();
		
		long time = System.currentTimeMillis();
		System.out.println(time);
		random = new Random(time);
		
		for(int i=0; i<6; i++) {
			System.out.print(random.nextInt(45)+1+" ");
		}
	}

}
