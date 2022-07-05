package ch08;

/*
 * customer 기능과 겹치는 부분은 상속을 받아서 사용하겠다. 
 * vipcustomer(구체적인클래스(하위-자식))가 customer(일반적인클래스(상위-부모)) class를 상속받는다.
 * 
 */

public class VIPCustomer extends Customer{
	
	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName); //상위클래스(customer) 생성자 호출 
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		System.out.println("VIPCustomer(int, String, int) 생성자 호출");
	}

	public int getAgentID() {
		return agentID;
	}
	
	public String showVIPInfo() {
		return super.showCustomerInfo() + "담당 상담원 아이디는" + agentID + "입니다.";
	}
}
