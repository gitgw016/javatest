package array;

public class ArrayExample {

	public static void main(String[] args) {
		//배열의 위치와 값을 선언과 동시에 초기화
		int[] scores = {70,60,50,40,60,60};
		System.out.println(scores);
		int[] scores2 = scores;
		System.out.println(scores2);
		scores[0] = 80;
		System.out.println(scores[0]);
		System.out.println(scores2[0]);
		System.out.println(scores == scores2);
		
		int a = 10;
		int b = a;
		b = 20;
		System.out.println(a == b);
		System.out.println("scores의 길이 : " + scores.length);
		
		int[] arrays;
		arrays = null;
		if(arrays == null) {
			arrays = new int[6];
		}
		
		arrays[5] = 80;
		arrays[3] = 60;
		
		for(int i=0; i<arrays.length; i++) { 
			System.out.printf("arrays[%d] : %d \n",i,arrays[i]);
		}
		//arrays[6] = 100;
		
		//arrays = null;
		//arrays[0] = 100;
		
		// 문자형 배열
		char chars[] = new char[26];
		char c = 'A';
		for(int i=0; i<chars.length; i++,c++) {
			chars[i] = c;
		}
		
		for(int i=0; i<chars.length; i++) {
			System.out.print("["+chars[i]+"]");
		}
		System.out.println();
		
		// 실수
		double[] doubles = new double[3];
		doubles[1] = 3.14;
		for(int i=0; i<doubles.length; i++) {
			System.out.print(doubles[i]+ " ");
		}
		System.out.println();
		
		// 논리형 - 초기값 false
		boolean[] tasks = new boolean[5];
		System.out.println(tasks[tasks.length-1]);
		
		// 참조 타입의 배열 선언과 동시에 값을 할당해야함 또는 new로 새로운 값 할당하여 선언
		String[] strs;
		strs = new String[]{"배민구", "오정만", "홍재관", "백만규", "심현석"};
		System.out.println(strs[0]);
		System.out.println(strs);
		//strs = new String[6];
		System.out.println(strs);
		// 향상된 for문 : for Each문
		for(String s : strs) {
			System.out.print(s + " ");
		}
		System.out.println();
		// 이차원 배열
		
		int array2 [][] = {
							{1,2,3},
							{4,5,6,7},
							{7,8,9}
						  };
		for(int i=0; i<array2.length; i++) {
			// System.out.println(array2[i]);
			System.out.print("{");
			for(int j = 0; j<array2[i].length; j++) {
				//System.out.printf("array2[%d][%d]-[%d]",i,j,array2[i][j]);
				System.out.print(array2[i][j] + " ");
			}
			System.out.print("}\n");
		}
		
		int[] array1[] = new int[2][];
		//						[배열 2개][배열의 길이]
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		array1[0] = new int[3];
		array1[1] = new int[4];
		System.out.println(array1.length);
		System.out.println(array1[0].length);
		System.out.println(array1[1].length);
		
	}

}
