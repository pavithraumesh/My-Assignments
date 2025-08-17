package week4.day1;

public class Amazon extends CanaraBank {

	@Override
	public void recordPaymentDetails() {
		System.out.println("Payment Details Recorded");
		}

	public static void main(String[] args) {
		Amazon bankOptions = new Amazon();
		bankOptions.recordPaymentDetails();
		bankOptions.cashOnDelivery();
		bankOptions.internetBanking();
		bankOptions.upiPayments();
		bankOptions.cardPayments();
		
		

	}
}
