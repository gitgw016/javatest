package test;

public class arrays {

	public static void main(String[] args) {
		
		int[] score = { 10,20,50,70,5,6,80,90 };
		for(int s : score) {
			System.out.print(s+" ");
		}
		System.out.println();
		int max = score[0];
		int min = score[0];
				
		for(int i=1; i<score.length; i++) {
				if(max < score[i]) {
					max = score[i];
				}
				if(min > score[i]) {
					min = score[i];
				}
			}
		System.out.println("최대값은 : "+max);
		System.out.println("최소값은 : "+min);
		}
	}


