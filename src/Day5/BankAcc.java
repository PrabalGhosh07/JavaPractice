package Day5;

class BankAcc implements BankMethods{
	private double balance;
	
	public BankAcc(double initianBalance){
		balance=initianBalance;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Deposite amount is Rs."+balance);
		}else {
			System.out.println("Invalid or insufficient funds.");
		}
	}
	
	public void withdraw(double amount) {
		if(amount>0 && amount <=balance) {
			balance-=amount;
			System.out.println("Withdrawl amount is Rs."+balance);
		}else {
			System.out.println("Invalid or insufficient funds.");
		}
	}

}
