package array;

import java.util.Scanner;

public class ArrayAnswer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 프로그램 종료 flag
		boolean isRun = true;
		// 학생점수를 입력받아 저장할 공간
		int[] scores = null;
		// 학생 수를 입력받아 저장
		int studentNum = 0;
		
		a : while(isRun) {
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
			if(selectNo !=5 && selectNo != 1 && scores == null) {
				System.out.println("학생 수를 먼저 등록해주세요");
				continue;
			}
			switch(selectNo) {
			case 1 :
				System.out.println("학생수를 입력>");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
				System.out.println("등록된 학생 수는 : "+scores.length);
				break;
			case 2 :
				System.out.println("점수 입력");
				for(int i=0; i<scores.length; i++) {
					System.out.print((i+1)+"번째 학생의 점수를 입력하세요>");
					scores[i] = sc.nextInt();
				}
				System.out.println("점수입력 완료");
				break;
			case 3 : 
				System.out.println("학생들의점수");
				for(int i=0; i<scores.length; i++) {
					System.out.println((i+1)+"번째 학생의 점수 : "+scores[i]+"점");
				}
				break;
			case 4 :
				System.out.println("분석");
				int sum = 0;
				double avg = 0;
				int max = 0;
				int min = scores[0];
				for(int i : scores) {
					sum += i;
					if(max < i) {
						max = i;
					}else if(min > i) {
						min = i;
					}
				}
				avg = (double)sum / studentNum;
				System.out.println("총점 : "+sum);
				System.out.println("평균 : "+avg);
				System.out.println("최고 : "+max);
				System.out.println("최저 : "+min);
				break;
			default :
				System.out.println("종료");
				break a;
			}
			}
		
		}
	}