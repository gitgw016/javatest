package f04_copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyExample {

	public static void main(String[] args) {
		String original = "C:/Temp/rice.png";
		String target = "C:/Temp/dir/copy.png";
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(original);
			fos = new FileOutputStream(target);
			
			int readByte;
			byte[] bytes = new byte[100];
			while((readByte = fis.read(bytes))!= -1) {
				fos.write(bytes,0,readByte);
			}
			fos.flush();
			
		} catch (IOException e) {
			System.out.println("실패 "+e.getMessage());
		}finally {
				try {
					if(fis != null)fis.close();
					if(fos != null)fis.close();
				} catch (IOException e) {}
		}
		
	}

}
