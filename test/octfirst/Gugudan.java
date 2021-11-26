package octfirst;

public class Gugudan {

	public static void main(String[] args) {
		for(int i=2; i<10; i++) {
			for(int j=2; j<10; j++) {
				System.out.printf("%d * %d = %2d\t",j,i,(i*j));
			}
			System.out.println();
		}
	}

}
