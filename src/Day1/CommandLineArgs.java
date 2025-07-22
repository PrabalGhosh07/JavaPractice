package Day1;

public class CommandLineArgs {
	public static void main(String[] args) {
		if(args.length<2) {
			System.out.println("Please provide two num");
			return ;
		}
		try {
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			System.out.println("Sum = "+(a+b));
		}catch (Exception e) {
			System.out.println("Invalid user input"+e.getMessage());
		}
	}

}
