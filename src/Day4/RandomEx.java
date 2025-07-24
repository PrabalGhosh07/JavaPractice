package Day4;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		Random random= new Random();
		int randomNum = random.nextInt(100);
		System.out.println("Random number b/w 1 to 99 : "+randomNum);
		
	}

}
