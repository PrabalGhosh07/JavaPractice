package Day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionsAllFunctions2 {

	public static void main(String[] args) {
		ArrayList<String>courses = new ArrayList<String>();
		courses.add("java");
		courses.add("python");
		courses.add("data structures");
		courses.add("java");
		for(String c: courses) {
			System.out.println(c);
		}
		
		//------------------------------------------------------
		Set<Integer>courses2 = new HashSet<Integer>();
		courses2.add(50);
		courses2.add(80);
		courses2.add(100);
		courses2.add(10);
		for(Integer j : courses2)
		{
			System.out.println(j);
		}
		//------------------------------------------------------
		
		Map<String, Integer> courses3 = new HashMap<String, Integer>();
		courses3.put("java", 101);
		courses3.put("python", 102);
		courses3.put("data structures", 101);
		courses3.put("java", 104);
		courses3.put("java", 105);
		for(String c :courses3.keySet()) {
			System.out.println(c + "=" + courses3.get(c));
					
		}

	}

}
