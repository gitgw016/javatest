package f.polymorphism;

public class PersonExample {

	public static void main(String[] args) {
		Bank bank = new Bank();
		// 아래 toString은 object에 있는 타입을 불러옴
		System.out.println(bank.toString());
		
		Person person = new Person("배민구", 80, 60, 170);
		System.out.println(person.toString());
		System.out.println("=================");
		System.out.println(bank);
		System.out.println(person);
		Bank badBank = null;
		System.out.println(badBank);
		
		Person s = new Student("오정만", 50, 80, 170, "8반", "40번", "1");
		System.out.println(s);
		// s.study();
		
		Person t = new Teacher("백만규", 35, 70, 175, "BAE-01", "디아블로2", "8반");
		System.out.println(t);
		// t.teach();
		Teacher t1 = (Teacher)t;
		t1.teach();
		
		Teacher t2 = null;
		if(s instanceof Teacher) {
			System.out.println("Teacher Type");
			t2 = (Teacher)s;
			t2.teach();
		}else {
			System.out.println("Teacher Type이 아니다.");
		}
	}

}
