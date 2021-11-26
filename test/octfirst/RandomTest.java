package octfirst;

public class RandomTest {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=0; i<10;i++) {
			int number = (int)(Math.random()*100)+1;
			System.out.print(number+" ");
			sum += number;
		}
		System.out.println(" 난수 총합계 : "+sum);
	}

}
