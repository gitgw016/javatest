package f.polymorphism.customer;

public class Customer {
	int customerID;			// 고객 아이디
	String customerName;	// 고객 이름
	String customerGrade;	// 고객 등급
	int bonusPoint;			// 보너스 포인트
	double bonusRatio;		// 보너스 포인트 적립율
	
	// 고객 아이디 고객 이름을 매개변수로 넘겨받는 생성자
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}
	
	// 고객 등급과 보너스 적립을 초기화
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	// 보너스 포인트 적립 후 구매 가격 알림.
	public void initCustomer() {
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01;
	}
	
	public String showCustomerInfo() {
		return customerName+"님의 등급은 "+customerGrade+"이며"+" 보너스 포인트는"+bonusPoint+"입니다.";
	}
}
