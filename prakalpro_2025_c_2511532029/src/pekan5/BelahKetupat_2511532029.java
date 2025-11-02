package pekan5;

public class BelahKetupat_2511532029 {
    public static void main(String[] args) {
        int titik = 4;
        int ukuran = 4;

        String garisAtas = "#";
        int panjang = titik * ukuran - 1;
        for (int i = 0; i < panjang + 1; i++) {
            garisAtas = garisAtas + "=";
        }
        garisAtas = garisAtas + "#";
        System.out.println(garisAtas);

        for (int i = 0; i < ukuran; i++) {
            String baris = "|";
            int spasi = (ukuran - 1) * 2;
            for (int j = 0; j < spasi - 2 * i; j++) {
                baris = baris + " ";
            }

            baris = baris + "<>";
            int jumlahTitik = titik * i;
            for (int j = 0; j < jumlahTitik; j++) {
                baris = baris + ".";
            }
            baris = baris + "<>";

            for (int j = 0; j < spasi - 2 * i; j++) {
                baris = baris + " ";
            }
            baris = baris + "|";

            System.out.println(baris);
        }

        for (int i = 0; i < ukuran; i++) {
            String baris = "|";
            int spasi = 0;
            for (int j = 0; j < spasi + 2 * i; j++) {
                baris = baris + " ";
            }

            baris = baris + "<>";
            int jumlahTitik = titik * (ukuran - (i + 1));
            for (int j = 0; j < jumlahTitik; j++) {
                baris = baris + ".";
            }
            baris = baris + "<>";

            for (int j = 0; j < spasi + 2 * i; j++) {
                baris = baris + " ";
            }
            baris = baris + "|";

            System.out.println(baris);
        }

        String garisBawah = "#";
        for (int i = 0; i < panjang + 1; i++) {
            garisBawah = garisBawah + "=";
        }
        garisBawah = garisBawah + "#";
        System.out.println(garisBawah);
    }
}