package Day7;

public class Bank_main {

	public static void main(String[] args) throws InterruptedException {
		Bank_MutiThreading account = new Bank_MutiThreading(1000.0);
		Thread t1 = new Thread(() -> {
			for(int i=0;i<3;i++) {
				account.Deposite(200.0);
				sleep(100);
			}
		},"Deposite-Thread");
		//---------------------------
		Thread t2 = new Thread(() -> {
			for(int i=0;i<3;i++) {
				account.Withdraw(150.0);
				sleep(120);
			}
		},"Withdraw-Thread");
		//-----------------------------
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.printf("Final Balance = %.2f%n",account.getBalance());
		
	}

	private static void sleep(int millies) {
		try {
			Thread.sleep(millies);
		} catch (InterruptedException ignore) {}
			
	}
	
}
