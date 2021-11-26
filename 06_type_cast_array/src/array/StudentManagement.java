package array;

import java.util.Scanner;

public class StudentManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 프로그램 종료 flag
		boolean isRun = true;
		// 학생점수를 입력받아 저장할 공간
		int[] scores = null;
		// 학생 수를 입력받아 저장
		int studentNum = 0;
		
		while(isRun) {
			System.out.println("==================================");
			System.out.println("1.학생 수|2.점수입력|3.전체점수|4.분석|종료");
			System.out.println("==================================");
			System.out.println("선택하실 기능의 번호를 입력하세요 >");
			int selectNo = sc.nextInt();
			System.out.println("선택하신 번호는 : " + selectNo);
			/*
			 * 1. 학생수를 입력 -> 입력한 삭생수 만큼 점수를 저장할 수 있는 배열 생성
			 * 2.scores배열의 크기만큼 학새으이 점수를 입력받아서 순차적으로 저장
			 * 3.scores배열에 저장된 학생들의 점수를 출력
			 * 4.분석 - 총점, 평균점수, 최고점수, 최저점수 출력
			 * 종료
			 */
			if(selectNo == 1) {
				System.out.println("학생의 수를 입력해주세요.");
				studentNum = sc.nextInt();
				System.out.println("총 학생의 수는 : " + studentNum+"명 입니다");
				scores = new int[studentNum];
			}else if(selectNo == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.println((i+1)+"번째 학생의 점수는?");
					int number = sc.nextInt();
					scores[i] = number;
				}
			}else if(selectNo == 3) {
				for(int i : scores) {
					System.out.print(i+"점 ");
				}System.out.println();
			}else if(selectNo == 4) {
				int t = 0;
				for(int i=0; i<scores.length; i++) {
					t += scores[i];
				}
				int avg = t/studentNum;
				System.out.println("학생들의 총점 : " + t);
				System.out.println("평균점수 : " + avg);
				int temp = 0;
				for(int i=0; i<scores.length; i++) {
					for(int j=i+1; j<scores.length; j++) {
						if(scores[i] < scores[j]) {
							temp = scores[i];
							scores[i] = scores[j];
							scores[j] = temp;
						}
					}
				}
				System.out.println("최고점수 : "+scores[0]);
				System.out.println("최저점수 : "+scores[scores.length-1]);
			}else {
				System.out.println("종료");
				break;
			}
		}
	}

}
