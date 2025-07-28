package Day7;

public class Bank_MutiThreading {
	private double balance;
	
	public Bank_MutiThreading(double initialbalance) {
		this.balance=initialbalance;
	}
	
	public synchronized void Deposite(double amount) {
		balance+=amount;
		System.out.printf("%s deposited : %.2f, Balance : %.2f%n",
				Thread.currentThread().getName(),amount,balance);
	}
	
	public synchronized void Withdraw(double amount)
	{
		if(balance>=amount) {
			balance-=amount;
			System.out.printf("%s Withdrawn : %.2f, Balance : %.2f%n", 
					Thread.currentThread().getName(), amount,balance);
		}else {
			System.out.printf("%s Insufficiant Balance : %.2f, Balance : %.2f%n", 
					Thread.currentThread().getName(), amount,balance);
		}
	}
	
	public double getBalance() {
		return balance ;
	}
}
