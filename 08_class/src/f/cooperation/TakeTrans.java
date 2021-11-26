package f.cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		Bus bus100 = new Bus(100);
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2호선");
		subwayGreen.showInfo();
		
		System.out.println();
		
		Student studentSim = new Student("sim",5000);
		Student studentBae = new Student("bae",20000);
		
		studentSim.takeBus(bus100);
		studentBae.takeSubway(subwayGreen);
		
		bus100.showInfo();
		studentSim.showInfo();
		
		System.out.println();
		
		subwayGreen.showInfo();
		studentBae.showInfo();
	}

}
