package f09_data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamExample {

	public static void main(String[] args) {
		// 기본 타입 8가지 + String
		try {
			FileOutputStream fos = new FileOutputStream("primitive.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeUTF("배민구");
			dos.writeDouble(11.1);
			dos.writeInt(10);
			dos.writeByte(5);
			
			dos.writeUTF("오정만");
			dos.writeDouble(50.5);
			dos.writeInt(50);
			dos.writeByte(10);
			
			dos.flush();
			dos.close();
			
			DataInputStream dis = new DataInputStream(new FileInputStream("primitive.txt"));
			// 저장 순서대로 불러와야 함 
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			byte age = dis.readByte();
			System.out.println("name : "+name);
			System.out.println("score : "+score);
			System.out.println("order : "+order);
			System.out.println("age : "+age);
			System.out.println("------------------------");
			name = dis.readUTF();
			score = dis.readDouble();
			order = dis.readInt();
			age = dis.readByte();
			System.out.println("name : "+name);
			System.out.println("score : "+score);
			System.out.println("order : "+order);
			System.out.println("age : "+age);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
