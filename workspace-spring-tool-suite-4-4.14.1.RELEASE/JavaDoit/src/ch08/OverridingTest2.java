package ch08;

public class OverridingTest2 {

	public static void main(String[] args) {
		//묵시적 형변환으로 vipcustomer가 customer형으로 변환됨. 
		Customer vc = new VIPCustomer(10030, "나몰라", 2000);
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getCustomerName() + "님이 지불해야 하는 금액은" 
		+ vc.calcPrice(10000) + "원입니다.");
		
		//customer로 형변환되어도 vipcustomer 메서드가 출력됨.
		//=> 생성된 인스턴스의 메서드를 호출하기 때문 = 이를 가상메서드라 함. 
	}

}
