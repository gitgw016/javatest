package g.abstract1;

public abstract class Animal {
	
	String kind;	// 분류
	
	public void breath() {
		System.out.println(kind+"가 숨을 쉰다.");
	}
	
	public abstract void sound();
	
}
