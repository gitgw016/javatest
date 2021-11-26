package explain2;

import java.util.Arrays;

public class Explain1 {
	
	public static <T> void printArray (T[] array) {
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {
		
		Integer[] iArray = {10, 20, 30, 40 ,50};
		
		Double[] dArray = {1.1, 1.2, 1.3, 1.4, 1.5};
		
		Character[] cArray = {'K', 'O', 'R', 'E', 'A'};
		
		Explain1.<Integer>printArray(iArray);
		Explain1.<Double>printArray(dArray);
		Explain1.<Character>printArray(cArray);
		
	}


}
