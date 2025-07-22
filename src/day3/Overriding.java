package day3;

public class Overriding {
	public static void main(String[] args) {
		Animal s0=new Animal();
		Animal s1=new Animal2();
		Animal s2=new Animal3();
		s0.a();
		s1.a();
		s2.a();
		
	}
}
 class Animal{
	 void a(){
		 System.out.println("It is a cat");
	 }
 }
 class Animal2 extends Animal{
	 @Override
	 void a(){
		 System.out.println("It is a dog");
	 }
 }
 class Animal3 extends Animal{
	 @Override
	 void a(){
		 System.out.println("It is a tiger");
	 }
 }
