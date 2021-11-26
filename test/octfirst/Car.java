package octfirst;

public class Car {
	
	String color;
	int speed;
	int gear;
	
	void speedUp(){
		speed += 10;
	}
	
	void speedDown() {
		speed -= 10;
	}
	
	String showInfo(){
		return "Car [color="+color+", speed="+speed+", gear="+gear+"]";
	}
		
}
