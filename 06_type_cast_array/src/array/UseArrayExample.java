package array;

public class UseArrayExample {

	public static void main(String[] args) {
		
		// 배열 생성 방법
		// 1. 정해진 값이 있을 시
		// 정해진 값으로 크기가 결정되므로 크기를 지정할 필요가 없음.
		int[] array = new int[]{10,20,30,40,50,60};
		
		// 2. 선언과 동시에 값을 지정할때는 new 연산자를 생략가능
		int[] array2 = {50,60,80,70};
		
		// 3. 생성 시 값이 정해져 있지 않을 때는
		//    공간만 생성 가능
		// 공간에 기본값으로 자동 초기화
		// 정수 - 0  |  실수 - 0.0 | 논리 - false | 참조 - null
		
		
		int[] array3 = new int[3];
		/*
		int형 정수값 3개를 저장할 수 있는 공간을 확보
		
		각 배열의 값이 저장되는 공간에 접근 할때는
		index 번호를 이용
		*/
		// 배열의 인덱스 번호는 0번 부터 시작하며
		// 배열의 전체 크기의 -1만큼 1씩 증가하며 번호를 부여받음
		
		//		index     0  1  2 
		//		array3 = [0][0][0]
		
		// 배열의 전체크기를 저장하고 있는 length
		// array3.length = 10; // - 오류
		// 배열의 크기를 저장하고 있는 값으로 값을 변경 할 수 없음.
		System.out.println(array3.length);
		
		// array3배열의 0번째 인덱스 값을 꺼내와 a변수에 대입
		int a = array3[0];
		System.out.println(a);
		array3[0] = 30;
		array3[1] = 50;
		array3[2] = 70;
		// array3[3] = 80;
		// array3 배열은 총 3개의 값을 저장하는 공간을 가지고 있으므로
		// 3번 인덱스 번호의 공간은 존재하지 않음.
		// 오류 발생

		// 순차적으로 증가하는 인덱스 번호를 가지고 있으므로
		// 반복문을 이용하여 배열의 값에 접근이 용이함.
		
		// 0 ~ (array3.length -1) 까지 순차적으로 증가
		for(int i=0; i<array3.length; i++) {
			System.out.println(array3[i]);
		}
	}
}