package f03_input;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class ReadExample2 {

	public static void main(String[] args) throws Exception{
		InputStream is = new FileInputStream("C:/Temp/file1.txt");
		byte[] bytes = new byte[8];
		// 3번째 인덱스에 2개의 값을 저장
		is.read(bytes,3,2);
		System.out.println(Arrays.toString(bytes));
		
		System.out.println(new String(bytes));
		is.close();
	}

}
