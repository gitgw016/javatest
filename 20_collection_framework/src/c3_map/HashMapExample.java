package c3_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("배민구", 10);
		map.put("오정만", 25);
		map.put("홍재관", 65);
		map.put("백만규", 80);
		System.out.println(map);
		map.put("오정만", 60);
		System.out.println(map);
		int score = map.get("배민구");
		System.out.println(score);
		map.remove("홍재관");
		System.out.println(map);
		
		System.out.println(map.containsKey("배민구"));
		System.out.println(map.containsValue(10));
		System.out.println("=============================");
		
		Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String,Integer>> entry = entrySet.iterator();
		while(entry.hasNext()) {
			Map.Entry<String,Integer> ent = entry.next();
			System.out.println("key : "+ent.getKey());
			System.out.println("value : "+ent.getValue());
			if(ent.getKey().equals("오정만")) {
				entry.remove();
			}
		}
		System.out.println(map);
		System.out.println("=============================");
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyItr = keySet.iterator();
		while(keyItr.hasNext()) {
			String key = keyItr.next();
			int value = map.get(key);
			System.out.println("key : "+key+", value : "+value);
//			if(key.equals("백만규")) {
//				map.remove(key);
//			}
		}
		System.out.println(map);
		
		for(String s : keySet) {
			System.out.println("key : "+s);
		}
	}

}
