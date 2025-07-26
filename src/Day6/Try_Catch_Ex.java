package Day6;

public class Try_Catch_Ex {
	public static void main(String[] args) {
		try {
			int arr[]= {2,3,4,5,6};
			
			for(int i=0;i<arr.length;i++) {
				int factorial=1;
				for (int j = arr[i]; j >0; j--) {
	                factorial *= j;
	            }
				System.err.println("Factorial of "+arr[i]+" is :"+factorial);
			}
			System.out.println("Try the fetch 6th element of this Array :"+arr[arr.length+1]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Tried to access an idex that doesn't exsit ....");
		}finally {
			System.out.println("Program executed ......");
		}
	}

}
