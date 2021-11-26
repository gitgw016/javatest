package f07_stream_reader_writer;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class SystemReaderExample {

	public static void main(String[] args)throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		int readData = 0;
		char[] cbuf = new char[100];
		while((readData = reader.read(cbuf)) != -1) {
			// 캐릭터 배열로 문자열 생성 하되 캐럭터 배열에 0번째 인덱스 부터, readData 길이만큼만 문자열로 생성
			String data = new String(cbuf,0,readData);
			// quit으로 시작하는지 물어봄. 있으면 true 없으면 false
			if(data.startsWith("quit"))break;
			System.out.println(data);
		}
		
		reader.close();
		is.close();
		System.out.println("끝");
	}

}
