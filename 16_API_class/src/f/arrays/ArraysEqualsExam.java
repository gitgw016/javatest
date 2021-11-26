package f.arrays;

import java.util.Arrays;

public class ArraysEqualsExam {

	public static void main(String[] args) {
		int[][] original = {{1,2},{3,4}};
		System.out.println("얕은 복제");
		int[][] copy1 = Arrays.copyOf(original, original.length);
		System.out.println(original +"]]"+copy1+"]]");
		System.out.println("배열 번지 비교 : "+original.equals(copy1));
		System.out.println(original[0]+"]|"+copy1[0]+"]|"+original[1]+"]|"+copy1[1]+"]|");
		// 배열안의 실제 값을 비교
		System.out.println("1차원 배열 항목값 비교 : "+Arrays.equals(original, copy1));
		System.out.println(original[0][0]+"|"+copy1[0][0]+"|"+original[1][0]+"|"+copy1[1][0]+"");
		System.out.println(original[0][1]+"|"+copy1[0][1]+"|"+original[1][1]+"|"+copy1[1][1]+"");
		System.out.println("2차원배열 내부의 값 비교 : "+Arrays.deepEquals(original, copy1));
		System.out.println();
		
		System.out.println("깊은 복제 후 비교");
		int[][] copy2 = Arrays.copyOf(original, original.length);
		copy2[0] = Arrays.copyOf(original[0], original[0].length);
		copy2[1] = Arrays.copyOf(original[1], original[1].length);
		System.out.println("배열 번지 비교 : "+original.equals(copy2));
		System.out.println(Arrays.toString(original)); // 스택영역 좌표 출력
		System.out.println(Arrays.toString(copy2));
		System.out.println("1차원 배열 항목값 비교 : "+Arrays.equals(original, copy2)); // 좌표 값 비교
		System.out.println(Arrays.deepToString(original));
		System.out.println(Arrays.deepToString(copy2)); // 실제 값 출력
		System.out.println("2차원 배열 비교 : "+Arrays.deepEquals(original, copy2)); // 실제 값 비교
	}

}
