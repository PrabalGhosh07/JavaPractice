package Day2;

public class Array1 {
	public static void main(String[] args) {
        int[] arr = {100,200,300,400};
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        System.out.println("Sum = " + sum);
	}

}
