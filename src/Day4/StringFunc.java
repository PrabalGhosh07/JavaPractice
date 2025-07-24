package Day4;

public class StringFunc {
	public static void main(String[] args) {
	       String str = "   My name is Prabal Ghosh   ";
	       System.out.println("Length of the string: " + str.length());
	       
	       System.out.println("Character at index 5: " + str.charAt(5)); 
	       String subStr = str.substring(3, 8); 
	       System.out.println("Substring (3 to 8): " + subStr); 

	       System.out.println("String in lowercase: " + str.toLowerCase()); 
	       System.out.println("String in uppercase: " + str.toUpperCase());
	       
	       // 6. equals() - Compare two strings
	       String anotherStr = "My name is Raja Ghosh";
	       System.out.println("Strings are equal: " + str.trim().equals(anotherStr));
	       // 7. equalsIgnoreCase()
	       System.out.println("Strings are equal (ignore case): " + str.equalsIgnoreCase("   my name is prabal ghosh  ")); 
	       
	       
	       System.out.println("Trimmed string: '" + str.trim() + "'"); 
	       
	       System.out.println("Replace 'a' with 'A': " + str.replace('a', 'A'));
	       
	       System.out.println("Contains 'employee': " + str.contains("Prabal")); 
	       
	       System.out.println("Index of 'employee': " + str.indexOf("Prabal"));
	       
	       String[] words = str.trim().split(" ");
	       
	       System.out.println("Words in the string:");
	       for (String word : words) {
	           System.out.println(word);
	       }
	       
	       System.out.println("Starts with 'My name': " + str.startsWith("My name"));
	       
	       System.out.println("Ends with 'Ghosh': " + str.endsWith("Ghosh")); 
	       
	       int number = 456;
	       String numberStr = String.valueOf(number);
	       System.out.println("String value of number: " + numberStr); 
	   }

}
