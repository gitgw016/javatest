package f.polymorphism.customer;

public class VipCustomer extends GoldCustomer{
	
	private int agentID;	// 담당 직원

	public VipCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		super.customerGrade = "VIP";
		super.bonusRatio = 0.05;
		super.saleRatio = 0.2;
		this.agentID = agentID;
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " 담당직원 번호는 : "+this.agentID+"입니다.";
	}
	
	

	
	
}
