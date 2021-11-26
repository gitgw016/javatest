package array_test;

import java.util.Scanner;

public class TheaterReserve {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int size = 10;
		int[] seats = new int[size];
		
		a : while (true) {
			System.out.println("------------------------------");
			for(int i = 0; i < size; i++)
				System.out.print(i+1 + " ");
			System.out.println("\n----------------------------");
			for(int i = 0; i < size; i++) 
				System.out.print(seats[i] + " ");
			System.out.println("\n----------------------------");
			
			System.out.print("원하시는 좌석번호를 입력하세요(종료는 -1) : ");
			int s = scan.nextInt(); // 좌석입력
			if(s == -1) {
				System.out.println("종료합니다.");
				break a;
			}
			if(seats[s-1] == 0) {
				seats[s-1] = 1;
				System.out.print(seats[s]);
				System.out.println("예약되었습니다.");
			}else if(seats[s-1] == 1) {
				System.out.println("이미 예약된 자리입니다.");
				System.out.println();
				continue;
			}
			}
			
		}
	}


