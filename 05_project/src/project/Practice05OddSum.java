package project;

public class Practice05OddSum {

	public static void main(String[] args) {
		// Eclipse -> window -> Preferences -> Java -> Code Style -> Code Templates -> Code -> Method Body -> edit
		int sum = 0;
		int even = 0;
		for(int i=1; i<=100; i+=2) {
			System.out.print(i+" ");
			sum += i;
			even += (i+1);
		}
		System.out.println("\n홀수의 합은 : " + sum);
		System.out.println("\n짝수의 합은 : " + even);
	}

}
