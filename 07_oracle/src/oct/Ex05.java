package oct;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte[][] seats = new byte[10][10];
		/*
		for(byte[] b : seats) {
			for(byte b1 : b) {
				if(b1 == 0) {
					System.out.print("[□]");
				}else {
					System.out.print("[■]");
				}
			}
			System.out.println();
			*/
		char inputColumn = 0;
		boolean isRun = true;
			while(isRun) {
				System.out.println("          [screen]");
				for(int i=0; i<seats.length; i++) {
					System.out.print("["+(i+1)+"]");
				}
				System.out.println(" [행]");
				for(int i=0; i<seats.length; i++) {
					for(int j=0; j<seats[i].length; j++) {
						if(seats[i][j] == 0) {
							System.out.print("[□]");
						}else {
							System.out.print("[■]");
						}
					}
					System.out.println(" ["+(char)(i+65)+"열]");
				}
				System.out.println("예약하실 좌석의 열을 입력해주세요.");
				String s = sc.next();
				inputColumn = s.charAt(0);
				System.out.println("선택하신 열의 이름 : "+inputColumn);
				
				System.out.println("행 번호를 입력해주세요.");
				int rowNum = sc.nextInt();
				System.out.println("선택하신 행번호는 : "+rowNum+"입니다.");
				int column = (int)inputColumn-65;
				if(seats[column][rowNum-1] == 0 ) {
					seats[column][rowNum-1] = 1;
				}else if(seats[column][rowNum-1] == 1){
					System.out.println("이미 예약된 자리입니다.");
					continue;
				}
			}
		}
	}


