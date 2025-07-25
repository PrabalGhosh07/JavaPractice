package Day5;

interface BankMethods {
	double getBalance();
	default void deposit(double amount) {
        System.out.println("Depositing: ₹" + amount);
    }
	
	default void withdraw(double amount) {
        System.out.println("Withdrawing: ₹" + amount);
    }

}
