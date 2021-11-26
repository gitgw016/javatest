package c1_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		// 순서(index)가 존재하고 데이터 중복 저장이 가능한 List Collection
		ArrayList array = new ArrayList();
		array.add("배민구");
		array.add(-100);
		String s = (String)array.get(0);
		System.out.println(array);
		
		ArrayList<String> strs = new ArrayList<>();
		int strLength = strs.size();
		System.out.println("size : "+strLength);
		strs.add("배민구");
		strs.add("오정만");
		System.out.println(strs.size());
		strs.add("홍재관");
		strs.add("백만규");
		
		String str = strs.get(1);
		System.out.println(strs);
		System.out.println("index 1 : " + str);
		
		strs.add(2,"안홍");
		System.out.println(strs);
		
		strs.set(3,"재관홍");
		System.out.println(strs);
		
		// remove(index) index위치에 값 삭제
		String result = strs.remove(1);
		System.out.println(strs);
		System.out.println(result);
		
		strs.remove("안홍");
		System.out.println(strs.size());
		System.out.println(strs);
		
		boolean isCheck = strs.contains("안홍");
		System.out.println(isCheck);
		
		isCheck = strs.contains("재관홍");
		System.out.println(isCheck);
		
		// 값이 비어있으면 true, 하나라도 값이 존재하면 false
		isCheck = strs.isEmpty();
		System.out.println(strs);
		System.out.println("isEmpty : " +isCheck);
		
		// List안의 모든 값을 제거
		strs.clear();
		isCheck = strs.isEmpty();
		System.out.println(strs);
		System.out.println("isCheck : " + isCheck);
		
		strs.add("배민구");
		strs.add("앗민구");
		strs.add("쉐민구");
		String[] ss = strs.toArray(new String[strs.size()]);
		System.out.println(Arrays.toString(ss));
		List<String> list = Arrays.asList(ss);
		
	}

}
