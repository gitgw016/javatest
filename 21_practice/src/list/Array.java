package list;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

//Scanner 클래스를 사용하여 6개 학점('A', 'B', 'C', 'D', 'F')을 문자로 입력받아 ArrayList에 저장(Character) 
//하고, ArrayList를 검색하여 학점을 점수(A=4.0, B=3.0, C=2.0, D=1.0, F=0)로 변환하여 평균을 출력하는 프로그 
//램을 작성하시오.
//- 평균은 반올림하여 소수점 2번째 자리까지 표현
public class Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >>");
		String value = sc.nextLine();
		System.out.println("입력완료");
		String[] strs = value.split(" ");
		ArrayList<Character> array = new ArrayList<>();
		for(int i=0; i<strs.length; i++) {
			char c = strs[i].charAt(0);
			array.add(c);
		}
		double sum = 0;
		for(int i=0; i<array.size(); i++) {
			char c = array.get(i);
			switch(c) {
				case 'A':
					sum += 4.0;
					break;
				case 'B':
					sum += 3.0;
					break;
				case 'C':
					sum += 2.0;
					break;
				case 'D':
					sum += 1.0;
					break;
				case 'F':
					sum += 0.0;
					break;
			}
		}
		double avr = sum / array.size();
		double avr2 = (Math.rint(sum/array.size()*100))/100;
		DecimalFormat df = new DecimalFormat("##.##");
		String result = df.format(avr);
		System.out.println("평균은 : "+result );
		System.out.printf("평균은 : %.2f%n", avr);
		System.out.println("평균은 : "+avr2);
		
	}

}
