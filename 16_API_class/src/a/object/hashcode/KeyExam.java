package a.object.hashcode;

public class KeyExam {

	public static void main(String[] args) {
		Key key1 = new Key(1);
		Key key2 = new Key(2);
		Key key3 = new Key(1);
		
		System.out.println("key1 : "+key1.hashCode());
		System.out.println("key2 : "+key2.hashCode());
		System.out.println("key3 : "+key3.hashCode());
		
		Key key4 = key1;
		System.out.println("key4 : "+key4.hashCode());
		
		//여기서 부터는 경고
		java.util.HashMap<Key,String> map = new java.util.HashMap<>();
		map.put(key1, "배민구");
		map.put(key3, "오정만");
		String value1 = map.get(key1);
		String value2 = map.get(key3);
		// 저장된 map의 크기 배열의 length와 일치
		System.out.println(map.size());
		System.out.println(value1+" "+value2);
	}

}
