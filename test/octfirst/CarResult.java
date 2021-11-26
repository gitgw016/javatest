package octfirst;

public class CarResult {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.color = "red";
		myCar.speed = 0;
		myCar.gear = 1;
		System.out.println(myCar.showInfo());
		myCar.speedUp();
		myCar.gear = 2;
		System.out.println(myCar.showInfo());
		myCar.speedDown();
		myCar.gear = 1;
		System.out.println(myCar.showInfo());
	}

}
