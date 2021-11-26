package octfirst;

public class RandomTestArray {

	public static void main(String[] args) {
		int[] sum = new int[10];
		int temp = 0;
		int count = 0;
		System.out.print("최초의 리스트 : ");
		for(int i=0; i<sum.length;i++) {
			count++;
			sum[i] = (int)(Math.random()*100)+1;
			for(int j=0; j<i ;j++) {
				if(sum[j] == sum[i]) {
					i--;
					break;
				}
			}
		}
		for(int i : sum) {
		System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(count);
		System.out.print("정렬된 리스트 : ");
		for(int i=0;i<sum.length;i++) {
			for(int j=i+1; j<sum.length; j++) {
				if(sum[i]>sum[j]) {
				temp = sum[i];
				sum[i] = sum[j];
				sum[j] = temp;
				}
			}
		}
		for(int i : sum) {
			System.out.print(i +" ");
		}
	}

}
