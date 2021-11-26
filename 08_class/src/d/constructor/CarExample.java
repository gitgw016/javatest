package d.constructor;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car("배민구","안섬",5);
		System.out.println(car.company);
		System.out.println(car.model);
		System.out.println(car.maxSpeed);
		
		Car myCar = new Car("오정만", "안줌", "PINK");
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		
		Car subCar = new Car("홍재관", "안나오면", "핫핑크", 20, 5);
		System.out.println(subCar.model);
	}
}