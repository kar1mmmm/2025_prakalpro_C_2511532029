package pekan6_2511532029;
import java.util.Scanner;

public class perulanganWhile1_2511532029 {

	public static void main(String[] args) {
		int counter = 0;
		String jawab ;
		boolean running = true;
		// deklarasi scanner
		Scanner scan = new Scanner (System.in);
		
		while (running) {
			counter++;
			System.out.println("Jumlah = "+ counter);
			System.out.println("Apakah lanjut (ya/tidak)");
			jawab = scan.nextLine();
			// cek jawab = tidak, perulangan berhenti
			if (jawab.equalsIgnoreCase("tidak")) {
				running = false;
			}
			
		}
		System.out.println("Anda sudah melakukan perulangan sebanyak "+ counter+" kali");
		scan.close();

	}

}
