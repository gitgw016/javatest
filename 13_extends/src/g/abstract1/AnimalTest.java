package g.abstract1;

public class AnimalTest {

	public static void main(String[] args) {
		// Animal animal = new Animal();
		Animal animal = new Cat();
		animal.kind = "고양이";
		animal.breath();
		animal.sound();
		
		animal  = new Dog();
		animal.breath();
		animal.sound();
		
		// 익명 클래스
		Animal tiger = new Animal() {
			@Override
			public void sound() {
				System.out.println("밍배 밍배");
			}
		};
		
		tiger.kind = "호랑이";
		tiger.breath();
		tiger.sound();
		
		
	}

}
