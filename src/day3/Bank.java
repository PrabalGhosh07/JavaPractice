package day3;

public class Bank {
	private String accHolderName ;
	private double balance;
	
	public Bank(String accHolderName , double balance) {
		this.accHolderName=accHolderName;
		this.balance=balance;
	}
	public void deposite(double amount) {
		balance+=amount;
		System.out.println("The new balance is "+balance);
	}
	
	public void withdraw(double amount) {
		if(amount>balance) {
			System.out.println("Insufficient balance");
		}else {
			balance-=amount;
			System.out.println("Withdrawn blanace is "+balance);
		}
	}
	
	public void display(){
		System.out.println("Account Holder Name - "+accHolderName);
		System.out.println("Your Balance is - "+balance);
		
	}

}
