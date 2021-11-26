package f.arrays;

import java.util.Arrays;

public class ArraysCopyOfExam {

	public static void main(String[] args) {
		// 배열 복제
		char[] arr1 = {'B','M','G','O'};
		System.out.println("array 1 : "+Arrays.toString(arr1));
									//복제할 배열, 복사할 길이
		char[] arr2 = Arrays.copyOf(arr1, 3);
		System.out.println("array 2 : "+Arrays.toString(arr2));
		
		char[] arr3 = Arrays.copyOf(arr1, arr1.length);
		System.out.println("array 3 : "+Arrays.toString(arr3));
		
		// 특정 범위 복제 copyOfRange
		char[] arr4 = Arrays.copyOfRange(arr1,1,3);
		System.out.println("array 4 : "+Arrays.toString(arr4));
		
		char[] arr5 = Arrays.copyOf(arr1, arr1.length+1);
		arr5[arr1.length] = 'J';
		System.out.println("array 5 : "+Arrays.toString(arr5));
		
	}

}
