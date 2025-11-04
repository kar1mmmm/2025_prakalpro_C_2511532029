package pekan6_2511532029;
import java.util.Scanner;

public class SentinelLoop_2511532029 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int sum = 0;
		int number = 12;
		while (number != 0) {
			System.out.println("Masukan angka (o untuk keluar) :");
			number = console.nextInt();
			sum = sum + number;
		}
		System.out.println("Total nya adalah "+ sum);
		console.close();
	}

}
