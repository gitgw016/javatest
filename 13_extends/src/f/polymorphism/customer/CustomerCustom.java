package f.polymorphism.customer;

import java.util.Scanner;

public class CustomerCustom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customer[] customer = new Customer[10];
		System.out.println("고객 이름을 입력해주세요");
		
		for(int i=0; i<customer.length; i++) {
			Customer cName = new Customer(i,sc.next());
			if(customer[i] == null) {
				customer[i] = cName;
				System.out.println("등록 완료");
				System.out.println(customer[i].showCustomerInfo());
			}
		}
		
		
	}

}
