package exam;

public class ForSumHundred {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		for(i=1; i<=100; i++) {
			if(i % 2 == 0) {
				continue;
			}
			j = j+i;
		}
		System.out.println("합계  : " + j);
	}

}
