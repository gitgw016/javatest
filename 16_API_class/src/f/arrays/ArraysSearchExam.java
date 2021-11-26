package f.arrays;

import java.util.Arrays;

public class ArraysSearchExam {

	public static void main(String[] args) {
		int scores[] = {1, 10, 5, 8, 7};
					 //  0  1  2  3  4 
					 // -1 -2 -3 -4 -5 -6 // 해당되는 값을 못 찾을때 어디까지 검색했는지
		int index = Arrays.binarySearch(scores, 10); // 2진 검색 : 중간값보다 크면 오른쪽, 작으면 왼쪽
		System.out.println("index : "+index);
		System.out.println();
		
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		index = Arrays.binarySearch(scores, 10);
		System.out.println("찾은 index : "+index);
		System.out.println();
		
		for(int i=0; i<=10; i++) {
			index = Arrays.binarySearch(scores, i);
			System.out.println("숫자"+i+" 찾은 인덱스 : " +index);
		}
		System.out.println();
		
		String[] names = {"오정만","홍재관","배민구"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		index = Arrays.binarySearch(names, "홍재관");
		System.out.println("찾은 인덱스 : "+index);
	}

}
