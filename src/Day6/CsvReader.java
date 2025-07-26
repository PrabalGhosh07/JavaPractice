package Day6;

import java.io.BufferedReader;
import java.io.FileReader;

public class CsvReader {
	public static void main(String[] args) {
			try {
				BufferedReader br = new BufferedReader(new FileReader("data.csv"));
				String line;
				while((line=br.readLine())!=null) {
					String[] values = line.split(",");
	                for (String val : values) {
	                    System.out.print(val + "  ");
	                }
	                System.out.println();
				}
				br.close();
			} catch (Exception e) {
				System.out.println("Error reading CSV: " + e.getMessage());
			}
			finally {
				System.out.println("Code Executed......");
			}
	}

}
