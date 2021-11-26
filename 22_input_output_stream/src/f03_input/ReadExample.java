package f03_input;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {
		InputStream is = null;
		
		try {
			is = new FileInputStream("C:/Temp/file1.txt");
			int readByte = 0;
			while(true) {
				// 바이트 단위로 읽어와서 읽은 값을 int타입으로 반환
				readByte = is.read();
				System.out.println(readByte);
				// 파일의 끝을 알려주는값(End Of File(EOF)) : -1 
				if(readByte == -1)break;
				System.out.println((char)readByte);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			}catch(IOException e) {
				
			}
		}
	}

}
