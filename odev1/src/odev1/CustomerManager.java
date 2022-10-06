package odev1;

public class CustomerManager {
	Customer customer;
	ICreditManager creditManager;
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		this.customer=customer;
		this.creditManager=creditManager;
		
	}

	public void save() {
		System.out.println("M��teri kaydedildi: ");
		
	}
	public void delete() {
		System.out.println("M��teri silindi: ");
		
	}
	public void giveCredit() {
		creditManager.save();
		creditManager.calculate();
		System.out.println("Kredi verildi");
	}
}
