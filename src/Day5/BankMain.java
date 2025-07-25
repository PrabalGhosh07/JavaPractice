package Day5;

public class BankMain {
	public static void main(String[] args) {
		BankAcc obj= new BankAcc(5000);
		System.out.println("Intial bank balance is Rs."+obj.getBalance());
		
		obj.deposit(3000);
		obj.withdraw(2000);
	}

}
