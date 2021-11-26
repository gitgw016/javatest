package c5_tree_comparable;

import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		// 객체 검색 : Comparable 인터페이스가 구현되어 있어야 가능
		// 정렬기준을 잡아주는 Comparable Interface
		/*
		 * 현재 객체 < 파라미터로 넘어온 객체 : 음수 리턴
		 * 현재 객체 == 파라미터로 넘어온 객체 : 0 리턴
		 * 현재 객체 > 파라미터로 넘어온 객체 : 양수 리턴
		 * 음수 또는 0이면 객체의 자리를 그대로 유지
		 * 양수의 경우에는 두 객체의 자리를 변경
		 */
		
		TreeSet<String> stringSet = new TreeSet<>();
		stringSet.add("나라가");
		stringSet.add("가가가");
		stringSet.add("가나다");
		stringSet.add("가각가");
		System.out.println(stringSet);
		System.out.println("=========================================");
		
		TreeSet<Person> set = new TreeSet<>();
		set.add(new Person("배민구",70));
		set.add(new Person("오정만",300));
		set.add(new Person("홍재관",30));
		set.add(new Person("앗민구",65));
		System.out.println(set.toString());
	}

}
