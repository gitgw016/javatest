package array_test;

import java.util.Scanner;

public class explain3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array[] = null;
		System.out.println("크기를 입력하세요");
		int number = sc.nextInt();
		array = new int [number+1][number+1];
		for(int i=0; i<array.length; i++) {
			System.out.println();
			for(int j = 0; j<array[i].length; j++) {
				array[i][j] = j;
				if(i >= array[i][j]) {
					System.out.print(array[i][j] + " ");
				}
				
			}
				}
			}
		}

	


