package odev1;

public class Main {

	public static void main(String[] args) {
		
		Customer customer=new Customer();
		customer.setId(1);
		customer.setCity("Bingöl-Elazýð");
		
		CustomerManager customerManager=new CustomerManager(new Customer(),new MilitaryCreditManager());
		customerManager.giveCredit();
	}

}
