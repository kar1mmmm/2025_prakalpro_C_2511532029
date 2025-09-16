package pekan2;

public class DeklarasiVariabel {
	/*program java
	 * latihan
	 * tentang pendeklarasian variable
	 */
	static int umur=25; /* variable dapat langsung diinisasi */
	public static void main(String[] args) {
		int kode;
		boolean isDibawahUmur; /* perhatikan penulisan nama variable */
		kode = 1234; /* pengisian variable (assigment)*/
		double gaji; /* deklarasi variable dapat dimana saja */
		gaji = 5500000.23;
		isDibawahUmur = true;
		System.out.println("Status:"+isDibawahUmur);
		System.out.println("kode:"+kode);
		System.out.println("Umur:"+ umur);
		System.out.println("Gaji:"+gaji);
	}

}
