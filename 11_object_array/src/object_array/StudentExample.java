package object_array;

import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] students = null;
		int selectNo = 0;
		int stuCount = 0;
		
		box : while(true) {
			System.out.println("===================================");
			System.out.println("1.학생수|2.정보입력|3.정보확인|4.분석|5.종료");
			System.out.println("===================================");
			selectNo = sc.nextInt();
			
			if(selectNo != 1 && selectNo != 5 && students == null) {
				System.out.println("학생 수를 먼저 입력하라.");
				continue;
			}
			
			switch(selectNo) {
			case 1 :
				System.out.print("학생 수를 입력하라 : ");
				stuCount = sc.nextInt();
				students = new Student[stuCount];
				System.out.println("학생의 수는 : "+students.length+"명이다.");
				break;
			case 2 :
				System.out.println("학생의 정보를 입력하라");
				for(int i=0; i<students.length; i++) {
					students[i] = new Student();
					students[i].number = (i+1);
					System.out.print(students[i].number+"번 학생의 이름 : ");
					students[i].name = sc.next();
					System.out.print(students[i].number+"번 학생의 점수 : ");
					students[i].score = sc.nextInt();
				}
				break;
			case 3 :
				System.out.println("학생들의 정보");
				if(students[0] == null) {
					System.out.println("정보를 먼저 입력하라");
					continue box;
				}
				for(Student s : students) {
					System.out.println(s.toString());
				}
				break;
			case 4 :
				System.out.println("정보를 분석한다");
				// total, max, min, avg
				int total = 0;
				int max, min;
				max = min = students[0].score;
				double avg = 0;
				Student stuMax = students[0];
				Student stuMin = students[0];
				
				for(int i=0; i<students.length; i++) {
					int score = students[i].score;
					total += score;
					if(max < score) {
						max = score;
						stuMax = students[i];
					}
					if(min > score) {
						min = score;
						stuMin = students[i];
					}
				}
				avg = (double)total/stuCount;
				System.out.println("전체 점수 : " + total);
				System.out.print("최고 점수 : " + max);
				System.out.println("\t 최고 득점자 : "+ stuMax.toString());
				System.out.print("최저 점수 : " + min);
				System.out.println("\t 최저 득점자 : "+ stuMin.toString());
				System.out.printf("평균 점수 : %.1f\n",avg);
				break;
			case 5 :
				System.out.println("종료한다 ");
				break box;
			default :
				System.out.println("그 번호는 못쓴다.");
			}
		}
	}

}
