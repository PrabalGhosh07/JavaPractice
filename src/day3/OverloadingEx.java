package day3;

public class OverloadingEx {
	    public int add(int a, int b) {
	        return a + b;
	    }

	    public int add(int a, int b, int c) {
	        return a + b + c;
	    }

	    public double add(double a, double b) {
	        return a + b;
	    }

	    public String add(String s1, String s2) {
	        return s1 + s2;
	    }

	    public static void main(String[] args) {
	        OverloadingEx calc = new OverloadingEx();

	        int sum1 = calc.add(5, 10);
	        System.out.println("Sum of two integers: " + sum1);

	        int sum2 = calc.add(5, 10, 15);
	        System.out.println("Sum of three integers: " + sum2);

	        double sum3 = calc.add(5.5, 10.5);
	        System.out.println("Sum of two doubles: " + sum3);

	        String combinedString = calc.add("Hello, ", "Java!");
	        System.out.println("Combined string: " + combinedString);
	    }
}
