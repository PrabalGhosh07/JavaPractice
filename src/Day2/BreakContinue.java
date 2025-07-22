package Day2;

public class BreakContinue {
	public static void main(String[] args) {
		//break
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("i = " + i);
        }
        System.out.println("-----------------------------");
        //continue
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("i = " + i);
        }

    }


}
