package EcomPaymentSystem;

abstract class Payments{
	double amount;
	Payments(double amount){
		this.amount=amount;
	}
	
	abstract void makepayment();
	
	void display() {
		System.out.println("Payment is Successfull "+amount);
	}
}

class CreditCardpay extends Payments{

	CreditCardpay(double amount) {
		super(amount);
	}
	void makepayment() {
		System.out.println("Credit Card Payment is done of Rs."+amount);
	}
	
}

class UPIpay extends Payments{

	UPIpay(double amount) {
		super(amount);
	}
	void makepayment() {
		System.out.println("UPI Payment is done for Rs."+amount);
	}
	
}

public class PaymentSystemAbstarction {
	
	public static void main(String[] args) {
			Payments py=new UPIpay(45000);
			py.makepayment();
			System.out.println("UPI payment is Successful");
			Payments py1=new CreditCardpay(30000);
			py1.makepayment();
			System.out.println("Credit Card payment is Successful");
			
			
	}

}
