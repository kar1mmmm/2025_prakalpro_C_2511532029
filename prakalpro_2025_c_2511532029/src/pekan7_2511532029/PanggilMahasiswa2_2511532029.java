package pekan7_2511532029;

import java.util.Scanner;

public class PanggilMahasiswa2_2511532029 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nim: ");
		String x = input.nextLine();
		System.out.println("Nama: ");
		String y = input.nextLine();
		Mahasiswa_2511532029 a = new Mahasiswa_2511532029 ();
		a.setNim2(x);
		a.setNama(y);
		if (x.startsWith("25")) {
		System.out.println(y +"Anda angkatan 2025");
	}
	
		if (a.getNim2().contains("1153")); {
		System.out.println("Anda Mahasiswa Informatika");
	}
	a.cetak2();
	input.close();
	}
}
