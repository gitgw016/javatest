package f.arrays;

import java.util.Arrays;

public class ArraysSortExample {

	public static void main(String[] args) {
		int[] scores = {96,99,98,97,100};
		String values = Arrays.toString(scores);
		System.out.println(values);
		
		Arrays.sort(scores,2,4);
		System.out.println(Arrays.toString(scores));
		
		//오름차순 정렬
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		
		String [] names = {"배민구","오정만","홍재관","백만규"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names)); // 유니코드 값이 적은 순서대로 오름차순
		
		// Arrays.fill : 값을 대체
		Arrays.fill(names, 1,3,"민배구");
		System.out.println(Arrays.toString(names));
		
		Arrays.fill(names,"구민배");
		System.out.println(Arrays.toString(names));
	}
	
}
