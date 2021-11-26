package object_array;

// data class - Value Object(VO) : 값의 전달을 목적으로 함
public class Student {
	public int number;		// 학번
	public String name;		// 이름
	public int score;		// 점수
	
	// 기본 생성자 alt + s + a
	public Student() {}

	// 전체 필드의 값을 넘겨받아 초기화하는 생성자 alt + s + a
	public Student(int number, String name, int score) {
		this.number = number;
		this.name = name;
		this.score = score;
	}
	
	// alt + s + s + s
	public String toString() {
		return "Student [number=" + number + ", name=" + name + ", score=" + score + "]";
	}
	
	
	
	
}
