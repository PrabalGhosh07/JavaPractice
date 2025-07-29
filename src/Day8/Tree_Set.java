package Day8;

import java.util.TreeSet;

public class Tree_Set {
	public static void main(String[] args) {
		TreeSet<Integer>num = new TreeSet<Integer>();
		num.add(50);
		num.add(60);
		num.add(100);
		num.add(20);
		num.add(80);
		num.add(60);//Duplicate value is not allowed here bcz is it a Set
		
		System.out.println("List is in sorted beacause it is a TreeSet :"+num);
		
		System.out.println("Does it contain 100 ?"+num.contains(100));
		
		System.out.println("Number just higher than 20 in this list-> "+num.higher(20));
		System.out.println("Numbers just Lower than 50 in this list-> "+num.higher(50));
		
		System.out.println("Celling of 50 "+num.ceiling(50));
	}
}
