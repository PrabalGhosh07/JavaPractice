package Day2;

public class ReverseArray {
	public static void main(String[] args) {
        int[] arr = {70,30,50,20,10,60,80,100};

        System.out.println("Reversed array:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }


}
