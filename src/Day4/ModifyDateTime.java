	package Day4;

import java.util.Calendar;

public class ModifyDateTime {
	public static void main(String[] args) {
		Calendar calender = Calendar.getInstance();
		
		System.out.println("current Date and Time : "+calender.getTime());
		
		calender.set(Calendar.YEAR,2025);
		calender.set(Calendar.MONTH, Calendar.JULY);
		calender.set(Calendar.DAY_OF_MONTH, 29);
		
		System.out.println("Date after adding 5 days: " + calender.getTime());
        // Subtract 1 month from the current date
        calender.add(Calendar.MONTH, -1);
        System.out.println("Date after subtracting 1 month: " + calender.getTime());

		
		
	}
}
