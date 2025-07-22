package Day1;

class Utils {
    public static int add(int x, int y) {
        return x + y;
    }
}

public class StaticClass {
	public static void main(String[] args) {
		int sum=Utils.add(5, 9);
		System.out.println(sum);
	}
}
