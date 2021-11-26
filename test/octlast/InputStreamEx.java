package octlast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class InputStreamEx {

	public static void main(String[] args) {
		try {
			InputStream fis = new FileInputStream("test.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
