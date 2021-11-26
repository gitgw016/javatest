package d.constructor;

public class Car {
	
	String company;
	String model;
	String color;
	int maxSpeed;
	int speed;
	/*
	Car(){
		System.out.println("기본 생성자 호출");
	}
	*/
	Car(String c, String m, int s){
		company = c;
		model = m;
		maxSpeed = s;
	}
	
	Car(String company, String model, String color){
		this.company = company;
		this.model = model;
		this.color = color;
		System.out.println("3개의 매개변수를 넘겨받는 생성자 호출");
		
	}
	
	// alt + s + a
	Car(String company, String model, String color, int maxSpeed, int speed) {
		this(company,model,color); // 위에있는 this.company model color 호출(위치는 subCar)
		this.maxSpeed = maxSpeed;
		this.speed = speed;
		System.out.println("전체 필드의 값을 넘겨받는 생성자 호출");
	}
	
}
