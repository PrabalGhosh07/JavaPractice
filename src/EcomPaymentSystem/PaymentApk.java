package EcomPaymentSystem;

public class PaymentApk {
	public static void main(String[] args) {
		PayemntsMethod payment;
		
		payment=new UPIpayment();
		payment.pay(1500);
		
		payment=new CreditCardPayment();
		payment.pay(4000);
		
		payment=new CashonDelivery();
		payment.pay(700);
	}

}
