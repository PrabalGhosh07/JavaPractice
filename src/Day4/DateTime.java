package Day4;

import java.time.LocalDate;//importing local date class
import java.time.LocalTime;//importing local time class
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;//importing local date and time class
public class DateTime {
	public static void main(String args[]) {
		//Display local date
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		//display local time
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		//display local day and time
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("before fornatting the date and Time -- "+dt);
		
		//print day and time in a format
		DateTimeFormatter formmatingObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatDate = dt.format(formmatingObj);
		System.out.println("After formatted -- "+formatDate);
		
	}

}
