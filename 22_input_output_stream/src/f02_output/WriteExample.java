package f02_output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		String path = "C:"+File.separator+"Temp"+File.separator+"file1.txt";
		/*
		File file = new File(path);
		if(!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("파일 생성 완료");
			} catch (IOException e) {
				System.out.println("생성 실패 : "+e.getMessage());
			}
		}
		*/
		// OutputStream은 파일을 자동으로 생성해줌. 하지만 디렉토리는 생성 안함.
		try {
			//											// true면 이어쓰기가 된다.
			OutputStream os = new FileOutputStream(path,true);
			//String s = "ABC";
			String s = "한글";
			byte[] bytes = s.getBytes();
			//os.write(bytes,1,2);
			os.write(bytes);
			/*
			for(int i=0; i<bytes.length; i++) {
				os.write(bytes[i]);
			}
			*/
			// 꼭 작성 (남은 잔여 데이터 출력)
			os.flush();
			// 꼭 작성 (값 반환)
			os.close();
			System.out.println("작성 완료");
		} catch (FileNotFoundException e) {
			System.out.println("파일 못찾음.");
		} catch (IOException e) {
			System.out.println("출력 오류");
		}
		
		
	}
}
