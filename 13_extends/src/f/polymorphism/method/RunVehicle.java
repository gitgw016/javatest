package f.polymorphism.method;

public class RunVehicle {
	
	void runVehicle(Vehicle vehicle) {
		vehicle.run();
	}
	
	void runBus(Bus bus) {
		bus.run();
	}
	
	void runMingu(Mingu mingu) {
		mingu.run();
	}

	public static void main(String[] args) {
		RunVehicle rv = new RunVehicle();
		Bus bus = new Bus();
		rv.runBus(bus);
		
		Mingu mingu = new Mingu();
		//rv.runMingu(bus);
		rv.runMingu(mingu);
		
		rv.runVehicle(mingu);
		rv.runVehicle(bus);
		Jungman jm = new Jungman();
		rv.runVehicle(jm);
		
		
	}

}

class Jungman extends Vehicle{
	public void run() {
		System.out.println("정만이 안주면서 달린다.");
	}
}