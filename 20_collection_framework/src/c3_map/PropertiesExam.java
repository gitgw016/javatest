package c3_map;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExam {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("nope", "배민구");
		prop.put("nope", 10);
		System.out.println(prop.get("nope"));
		
		// prop.setProperty("key", 10);
		
		prop.setProperty("key","key value");
		System.out.println(prop.getProperty("key"));
		System.out.println(prop.getProperty("홍재관","홍재관은 평생 안나옴"));
		System.out.println("========================================");
		// 경고
		String path = PropertiesExam.class.getResource("db.properties").getPath();
		System.out.println(path);
		
		Properties prop2 = new Properties();
		try {
			prop2.load(new FileReader(path));
			System.out.println(prop.getProperty("driver"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
