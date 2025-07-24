package Day4;

import java.util.Arrays;
import java.util.Scanner;

public class SortingEmployee {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name of employees :");
		int emp=sc.nextInt();
		
		sc.nextLine();
		
		String[] employees= new String[emp];
		System.out.println("Enter the names :");
		for(int i=0;i<emp;i++) {
			employees[i]=sc.nextLine();
		}
		
		Arrays.sort(employees);
		
		System.out.println("Sorted Employees names :");
		for(String i:employees) {
			System.out.println(i);
		}
	}

}
