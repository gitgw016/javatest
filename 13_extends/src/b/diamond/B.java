package b.diamond;

public class B extends A{
	@Override // 부모에 있는것을 자식에게 재정의 한다는 것 (검증)
	// 부모와 동일한 형태일 경우 자식것이 호출 : 재정의
	public String methodA(int a) {
		System.out.println("B methodA");
		return "배민구";
	}
}
