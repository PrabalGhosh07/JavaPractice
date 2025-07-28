package Day7;


class C implements Runnable{
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

class D implements Runnable{
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
public class RunnableEx1 {
	public static void main(String[] args) {
		Runnable m1=new C();
		Runnable m2=new D();
		
		Thread t1= new Thread(m1);
		Thread t2= new Thread(m2);
		
		t1.start();
		t2.start();
		
	}

}
