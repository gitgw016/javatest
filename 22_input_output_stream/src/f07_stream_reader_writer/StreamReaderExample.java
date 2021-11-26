package f07_stream_reader_writer;

import java.io.*;

public class StreamReaderExample {

	public static void main(String[] args) throws Exception{
		String path = "C:/Temp/data.txt";
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		Reader reader = new InputStreamReader(fis);
		int readData = 0;
		
		char[] cbuf = new char[100];
		readData = reader.read(cbuf);
		System.out.println(readData);
		System.out.println(new String(cbuf));
		reader.close();
		fis.close();
	}

}
