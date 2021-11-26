package a.object.clone;

public class CloneExample {

	public static void main(String[] args) {
		Member member = new Member("배민구",80,new int[] {-100,-99,-98},new Car("리어카"));
		System.out.println(member);
		Member cloned = member.getMember();
		System.out.println(cloned);
		System.out.println(member.hashCode());
		System.out.println(cloned.hashCode());
		
		cloned.score[0] = 90;
		cloned.car.model = "경운기";
		cloned.name = "오정만";
		System.out.println(cloned);
		System.out.println(member);
	}

}
