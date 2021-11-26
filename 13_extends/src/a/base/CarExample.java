package a.base;
		// 객체(최상위)를 상속받고있다.(기본적으로 생략)
class Car extends Object{
	String company = "민구자동차";
	int maxSpeed;
	
	Car(){
		super();
		System.out.println("기본생성자 호출");
		// super();
	}
	
	Car(String company){
		System.out.println("company를 넘겨받는 생성자");
		this.company = company;
	}
	
	public String toString() {
		return "Car [company="+this.company+","+maxSpeed+"]";
	}
} // end Car class

class Taxi extends Car{
	Taxi(){
		super();
		System.out.println("Taxi 기본 생성자 호출");
	}
}

class Bus extends Car{
	Bus(){
		super("배민구자동차");
		System.out.println("버스 기본 생성자 호출");
	}
}

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car.toString());
		System.out.println("======================");
		Taxi taxi = new Taxi();
		taxi.company = "정만자동차";
		taxi.maxSpeed = 10;
		//상속으로 인해 기본생성자 호출 문구가 먼저 나옴 + 택시의 부모가 인스턴스에 생성
		System.out.println(taxi.toString());
		System.out.println("======================");
		Bus bus = new Bus();
		bus.company = "홍재관자동차";
		//상속으로 인해 company를 넘겨받는 생성자 문구가 먼저 나옴 + 버스의 부모가 인스턴스에 생성
		System.out.println(bus.toString());
	}
}
