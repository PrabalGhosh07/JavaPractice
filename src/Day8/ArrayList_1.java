package Day8;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_1 {
	public static void main(String[] args) {
		ArrayList<String>fruits=new ArrayList<String>();
		//adding element
		fruits.add("Apple");
		fruits.add("Graps");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Guava");
		System.out.println(fruits);
		
		//set elememnt
		fruits.set(3, "Pineapple");
		System.out.println(fruits);
		
		//remove element
		fruits.remove(4);
		System.out.println(fruits);
		fruits.add("Guava");
		//remove all element 
//		fruits.remove(0);
//		System.out.println(fruits);
		
		//size of array
		System.out.println("Size of this busket is "+fruits.size()+" fruits");
		
		//Loop in ArrayList
		for(int i=0;i<fruits.size();i++) {
			System.out.println(fruits.get(i));
		}
		
		for(String i:fruits) {
			System.out.println(i);
		}
		
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(60);
		list.add(30);
		list.add(70);
		list.add(90);
		list.add(100);
		list.add(10);
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println("After Sorting --"+list);


		
	}

}
