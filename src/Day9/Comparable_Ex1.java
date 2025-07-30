package Day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparable_Ex1 {

	public static void main(String[] args) {
		Comparator<Integer>c1 =new Comparator<Integer>() {

			public int compare(Integer i, Integer j) {
				if(i%10 > j%10)
					return 1;
				else
					return -1;
			}
			
		};
		
		ArrayList<Integer>num = new ArrayList<Integer>();
		num.add(50);
		num.add(40);
		num.add(100);
		num.add(10);
		num.add(80);
		System.out.println(num);
		Collections.sort(num,c1);
		System.out.println(num);
	}

}
