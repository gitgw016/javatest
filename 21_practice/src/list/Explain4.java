package list;

import java.util.Scanner;
import java.util.TreeSet;

public class Explain4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> set = new TreeSet<>();
		System.out.println("정수(-1이 될때까지 입력)");
		while(true) {
			int n = sc.nextInt();
			if(n == -1)break;
			set.add(n);
		}
		int min = set.first();
		int max = set.last();
		System.out.println(set);
		System.out.println("최소값 : "+min);
		System.out.println("최대값 : "+max);
		System.out.println("시스템 종료");
		sc.close();
	}

}
