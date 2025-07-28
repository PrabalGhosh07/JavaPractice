package Day7;

class A extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Hey It's Prabal");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class B extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("I love Harry Potter");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MultithredingEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A m1=new A();
		B m2 = new B();
		
		m1.start();
		//----------------------
		try {
			Thread.sleep(5);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		//------------------------
		m2.start();
		
	}

}
