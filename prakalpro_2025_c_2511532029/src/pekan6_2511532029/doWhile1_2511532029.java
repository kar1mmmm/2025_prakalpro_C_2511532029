package pekan6_2511532029;
import java.util.Scanner;

public class doWhile1_2511532029 {

	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		String phrase;
		do {
			System.out.println("Input pasword:");
			phrase = console.next();
			
		} while (!phrase.equals("abcd"));
		console.close();
		

	}

}
