package raja;

import java.util.Scanner;

public class Program3 {
	public static void main(String args[]) {
		System.out.print("type a and B");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=a+b;
		System.out.println(sum);
		
		
	}
}
