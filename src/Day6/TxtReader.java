package Day6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TxtReader {
	public static void main(String[] args) {
		try {
			BufferedReader br=new BufferedReader(new FileReader("data.txt"));
			String line;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("Error.... "+e.getMessage());
		}finally {
			System.out.println("----------------------");
			System.out.println("Program Executed");
		}
		
	}

}
