package f03_input;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ReadExample3 {

	public static void main(String[] args) throws Exception{
		File file = new File("src/f03_input/ReadExample.java");
		InputStream is = new FileInputStream(file);
		int data;
		OutputStream os = null;
		while((data = is.read()) != -1) {
			os = System.out;
			os.write(data);
			os.flush();
		}
		os.close();
		is.close();
		// output이 닫혀서 출력 안됨
		System.out.println("끝");
	}

}
