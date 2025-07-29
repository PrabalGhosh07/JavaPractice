package Day8;

public class WrapperClass {
	public static void main(String[] args) {
		int a=10;
		Integer i=a;//Datatype to Integer type ---- "Auto Boxing"
		int b = i.intValue();//Object back to datatype ----- "unboxing"
		int c=i; // It is called Auto "Unboxing" ....
		System.out.println("B="+b);
		System.out.println("C="+c);
		
		//String to Int ------------>
		String s="100";
		int x= Integer.parseInt(s);
		System.out.println("X="+x);
		
		//Float to Int --------------->
		Double p=20.36;
		int q=p.intValue();
		System.out.println("Q="+q);
		
		//Float to Int --------------->
		Float f=56.32f;
		int g=f.intValue();
		System.out.println("G="+g);
	}

}
