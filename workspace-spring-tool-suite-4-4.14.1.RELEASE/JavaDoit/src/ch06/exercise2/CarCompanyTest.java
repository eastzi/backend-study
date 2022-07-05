package ch06.exercise2;

public class CarCompanyTest {

	public static void main(String[] args) {
		CardCompany company = CardCompany.getInstance();
		
		Card myCard = company.createcCard();
		Card yourCard = company.createcCard();
		
		System.out.println(myCard.getCardNumber());
		System.out.println(yourCard.getCardNumber());
		

	}

}
