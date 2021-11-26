package c1_list;

// java.util.* = 모든 util 패키지에 있는 것을 사용
import java.util.*;


class Board{
	String subject;
	String content;
	String writer;
	
	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	
	
}

public class LinkedListExample {

	public static void main(String[] args) {
		List<Board> arrayList = new ArrayList<>();
		List<Board> linkedList = new LinkedList<>();
		
		long startTime = 0;
		long endTime = 0;
		
		int size = 100000;
		
		System.out.println("[추가작업 시간]");
		// 시간을 10억/1초로 표현
		startTime = System.nanoTime();
		for(int i=0; i<size; i++) {
			arrayList.add(0, new Board("제목"+i, "내용"+i,"글쓴이"+i));
		}
		endTime = System.nanoTime();
		System.out.println("array 추가 시간 : "+(endTime - startTime)+"ns");
		
		
		startTime = System.nanoTime();
		for(int i=0; i<size; i++) {
			linkedList.add(0, new Board("제목"+i, "내용"+i,"글쓴이"+i));
		}
		endTime = System.nanoTime();
		System.out.println("linked 추가 시간 : "+(endTime - startTime)+"ns");
		
		System.out.println("[검색작업 시간]");
		startTime = System.nanoTime();
		for(int i=0; i<size; i++) {
			arrayList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("array 검색 시간 : "+(endTime - startTime)+"ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<size; i++) {
			linkedList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("linked 검색 시간 : "+(endTime - startTime)+"ns");
		
		
	}

}
