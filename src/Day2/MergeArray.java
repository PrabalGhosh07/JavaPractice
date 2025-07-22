package Day2;

public class MergeArray {
	public static void main(String[] args) {
        int[] a = {10, 26, 34};
        int[] b = {40, 56};
        int[] c = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }

        System.out.println("Merged array:");
        for (int i : c) {
            System.out.print(i + " ");
        }
    }


}
