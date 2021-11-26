package explain2;

public class ArrayTest {

	public static void main(String[] args) {
		
		int length = 5;
		Integer scores[] = new Integer[length];
		scores[0] = 100;
		scores[1] = 70;
		scores[2] = 60;
		scores[3] = 80;
		scores[4] = 90;
		scores[2] = null;
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			if(scores[i] == null) {
				length--;
				continue;
			}
			sum += scores[i];
		}
		System.out.println("sum : "+ sum);
		System.out.println("avg : " + sum / (double)length);
		
		for(int i=0; i<scores.length; i++) {
			if(scores[i] == null) {
				scores[i] = 70;
				break;
			}
		}
		
		Integer[] newScores = new Integer[scores.length+1];
		for(int i=0; i<scores.length; i++) {
			newScores[i] = scores[i];
		}
		newScores[scores.length] = 60;
	}

}
