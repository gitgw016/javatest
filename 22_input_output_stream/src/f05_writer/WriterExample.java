package f05_writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

public class WriterExample {

	public static void main(String[] args) {
		try {
			Writer writer = new FileWriter("C:/Temp/data.txt",true);
			String str = "배민구씨";
			byte[] bytes = str.getBytes();
			char[] chars = str.toCharArray();
			
			System.out.println(Arrays.toString(chars));
			//writer.write(chars);
			//writer.write(new String("오정만"));
			writer.write("홍재관");
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
