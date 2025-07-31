package Day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsAllFunctions3 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 7, 2));
		
		System.out.println(a);
		Collections.sort(a);//sort acending order
		System.out.println("sorted:"+a);
		
		Collections.reverse(a);//sort reverse order
		System.out.println(a);
		
		Collections.shuffle(a);//shuffel the list
		System.err.println(a);
		
		//finding max and min
		System.out.println("Max : "+Collections.max(a)+" , Min : "+Collections.min(a));
		
		//Frequency of an element
		System.out.println("Frequency of 2 : "+Collections.frequency(a, 2));
		
		//Replace of the single value elements
		Collections.replaceAll(a,2, 50);
		System.out.println("After replace all 2 to 50 :"+a);
		
		//copy list from one to anothor
		List<Integer>b=Arrays.asList(10,20,30,40,50,60);
		Collections.copy(a, b);
		System.out.println("After copy from b : "+b);
		
		
	}

}
