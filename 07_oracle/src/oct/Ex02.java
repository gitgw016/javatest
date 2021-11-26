package oct;

public class Ex02 {

	public static void main(String[] args) {
		int[] s = {12,3,19,6,18,8,12,4,1,19};
		int minimum, maximum;
		minimum = maximum = s[0];
		
		for(int i : s ) {
			minimum = (i<minimum) ? i : minimum;
			maximum = (i<maximum) ? maximum : i;
		}
		System.out.println("최소값은 : "+minimum);
		System.out.println("최대값은 : "+maximum);
	}

}
