package raja;

public class Math_datetime {
	public static void main(String args[]) {
		int a=841;
		int b=900;
		System.out.println(Math.min(a, b));
		System.out.println(Math.max(a, b));
		
		System.out.println(Math.sqrt(a));
		System.out.println(Math.abs(-202500));
		
		//Random Number generayion
		//It's is not in our control
		System.out.println(Math.random());
		//control on Random number 
		int randomnum = (int)(Math.random()*1001);
		System.out.println(randomnum);
	}

}
