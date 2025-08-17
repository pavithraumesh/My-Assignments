package week4.day1;

public abstract class CanaraBank implements Payments{

	//Implemented and unimplemented
	
    public void cashOnDelivery() {
    	System.out.println("Cash Delivered");
    }
	
	public void upiPayments() {
		System.out.println("UPI Payment method");
	}
	
	public void cardPayments() {
		System.out.println("Card Payment performed");
	}
	
	public void internetBanking() {
		System.out.println("Internet Banking preferred");
	}
	
	public abstract void recordPaymentDetails();
	
}
