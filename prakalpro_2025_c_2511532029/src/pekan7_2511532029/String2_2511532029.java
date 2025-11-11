package pekan7_2511532029;
import java.util.Scanner;


public class String2_2511532029 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Nama depan:");
		String firstName = input.nextLine();
		System.out.println("Nama Belakang:");
		String lastName = input.nextLine();
		String txt1 = "Dosen\"intelektual\"kampus";
		System.out.println("Nama Lengkap:" + firstName+" " + lastName);
		System.out.println("Nama Lengkap:" + firstName.concat(lastName));
		System.out.println(txt1);
		int x = 10;
		int y = 20;
		int z = x + y;
		System.out.println("x + y =" + z);
		String a = "10";
		String b = "20";
		String c = a + b;
		System.out.println("a + b =" + c);
		String v = a + y;
		System.out.println("String a + Integer y =" + v);
		input.close();
	}

}
