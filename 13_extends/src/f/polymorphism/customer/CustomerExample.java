package f.polymorphism.customer;

public class CustomerExample {

	public static void main(String[] args) {
		Customer[] customerList = new Customer[10];
		
		Customer customerSim = new Customer(101,"심현석");
		Customer customerBae = new Customer(102,"배민구");
		Customer customerHong = new GoldCustomer(103,"홍재관");
		
		customerList[0] = customerSim;
		customerList[1] = customerBae;
		customerList[2] = customerHong;
		
		Customer customerOh = new VipCustomer(104,"오정만",11);
		customerList[3] = customerOh;
		
		System.out.println("=== 고객 정보 ===");
		for(Customer c : customerList) {
			if(c != null) {
				System.out.println(c.showCustomerInfo());
			}
		}
		System.out.println();
		System.out.println("== 할인율과 보너스 포인트 계산 ==");
		int price = 100000; // 지불 금액
		for(Customer c : customerList) {
			if(c != null) {
				int cost = c.calcPrice(price);
				System.out.println(c.customerName+"님이"+cost+"원 지불하셨습니다.");
				System.out.println(c.showCustomerInfo());
			}
		}
		
	}

}
