package array_test;

public class GetMin {

	public static void main(String[] args) {
		int s[] = {12, 3, 19, 6, 18, 8, 12, 4, 1 ,19};
		int minimum;
		minimum = s[0];
		for(int i : s) {
			if(minimum > i) {
				minimum = i;
			}
		
		}
		System.out.println("최소값은"+minimum);
	}

}