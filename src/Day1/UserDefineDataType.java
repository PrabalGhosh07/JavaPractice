package Day1;

import java.util.Scanner;

public class UserDefineDataType {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		System.out.println("Enter your height : ");
		double height = sc.nextDouble();
		
		System.out.println("Name -"+name);
		System.out.println("age -"+age);
		System.out.println("Height -"+height);
	}
}
