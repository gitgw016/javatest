package array_test;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("             SCREEN           ");
			char seat[][] = new char[10][10];
			for(int i=0; i<seat.length; i++)
				System.out.print("["+(i+1)+"]");
				System.out.print(" [행]");
			for(int i=0; i<seat.length; i++) {
				System.out.println();
				for(int j=0; j<seat.length; j++)
					System.out.print("[□]");
					System.out.print(" 열");
			}
			System.out.println();
			System.out.println("예약하실 좌석의 열을 입력해주세요.");
			char col = sc.next().charAt(0);
			System.out.println("입력한 열 : " + col);
			System.out.println("예약하실 좌석의 행 번호를 입력해주세요>");
			int row = sc.nextInt();
			System.out.println("선택하신 좌석은 : "+col+"열"+row+"행입니다.");
			System.out.println("예약 완료 하시겠습니까? y/n");
			char acp = sc.next().charAt(0);
			}

		}
}


