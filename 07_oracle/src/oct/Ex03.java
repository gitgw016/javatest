package oct;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("크기를 입력해주세요.");
		int size = sc.nextInt();
		int[] arrays[] = new int[size+1][];
		
		for(int i=0; i<arrays.length; i++) {
			arrays[i] = new int[i+1];
		}
		for(int[] i : arrays) {
			for(int j : i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(int i=0; i<arrays.length; i++) {
			for(int j=0; j<arrays[i].length; j++) {
				arrays[i][j] = j;
			}
		}
		for(int[] i : arrays) {
			for(int j : i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=0; i<arrays.length; i++) {
			arrays[i] = new int[i+1];
			for(int j=0; j<arrays[i].length; j++) {
				arrays[i][j] = j;
				System.out.print(arrays[i][j]+" ");
			}
			System.out.println();
		}
	}

}
