package Bank;

public class MainApk {
	public static void main(String[] args) {
		BillGenerator.displayHeader();
		System.out.println("-------------------------------");
		CreditCardpayment ccp= new CreditCardpayment(4500);
		ccp.makePayment();
		
		System.out.println("-------------------------------");
		
		UPIpayment upi = new UPIpayment(3000);
		upi.makePayment();
		
		BillGenerator bill = (amount) -> {
			System.out.println("Amount: Rs."+amount);
			System.out.println("Thank you for your payment!");
		};
	}

}
