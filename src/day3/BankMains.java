package day3;

public class BankMains {
	public static void main(String[] args) {
		Bank ob = new Bank("Prabal", 2000);
		ob.deposite(500);
		ob.display();
		ob.withdraw(1000);
		ob.display();
	}

}
