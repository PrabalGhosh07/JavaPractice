package Day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
	public int age ;
	public String name ;
	public Student(int age,String name) {
		this.age=age;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student o) {
		return 0;
	}
	
}
public class Collections_Comparable_Ex2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<Student> com=new Comparator<Student>() {
			public int compare(Student i, Student j) {
				if(i.age>j.age)
					return 1;
				else
					return -1;
			}
		};
        List<Student> stud= new ArrayList<>();
        stud.add(new Student(22,"karthik"));
        stud.add(new Student(24,"Sanjeev"));
        stud.add(new Student(23,"Sunil"));
        Collections.sort(stud,com);
       
    for(Student s:stud) {
   	 System.out.println(s);
    }
   
   
       
	}


}
