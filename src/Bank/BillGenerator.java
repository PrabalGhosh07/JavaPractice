package Bank;

@FunctionalInterface
public interface BillGenerator {
	void generator(double amount);
	
	default void ShowBillFormat() {
		System.out.println("***** BILL RECEIPT *****");
	}
	
	static void displayHeader() {
		System.out.println("Welcome to Online Billing System");
	}

}
