package exam;

public class ForSum {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		System.out.println("- 결과\n");
		for(i=1;i<=10;i++) {
			System.out.print("  " +i+"");
			j = j+i;
		}
		System.out.println("\n   합 : " + j);
	}

}
