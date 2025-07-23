package Bank;

public abstract class Payments {
	protected double amount;
	
	public Payments(double amount) {
		this.amount=amount;
	}
	
	public void paymentRecipt() {
		System.out.println("Payment of Rs."+amount+" is processed");
	}
	public abstract void makePayment();

}

class CreditCardpayment extends Payments{

	public CreditCardpayment(double amount) {
		super(amount);
	}

	@Override
	public void makePayment() {
		System.out.println("Processing your Credit Card Payment of Rs."+amount);
		paymentRecipt();
		
	}
	
}

class UPIpayment extends Payments{

	public UPIpayment(double amount) {
		super(amount);
	}

	@Override
	public void makePayment() {
		System.out.println("Processing your UPI Payment of Rs."+amount);
		paymentRecipt();
	}
	
}


