package Day2;

public class SearchInArray {
	public static void main(String[] args) {
        int[] arr = {70,30,50,20,10,60,80,100};
        int key = 30;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }
    }


}
