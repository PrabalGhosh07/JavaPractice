package day3;

public class Overriding {
	public static void main(String[] args) {
		Animal s0=new Animal();
		Animal s1=new Animal2();
		Animal s2=new Animal3();
		s0.a("Cat");
		s1.a("Dog");
		s2.a("Tiger");
		
	}
}
 class Animal{
	 void a(String i){
		 System.out.println("It is a "+i);
	 }
 }
 class Animal2 extends Animal{
	 @Override
	 void a(String b){
		 System.out.println("It is a "+b);
	 }
 }
 class Animal3 extends Animal{
	 @Override
	 void a(String b){
		 System.out.println("It is a "+b);
	 }
 }
