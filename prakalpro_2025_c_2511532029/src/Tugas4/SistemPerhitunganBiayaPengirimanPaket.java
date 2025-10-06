package Tugas4;
import java.util.Scanner;

public class SistemPerhitunganBiayaPengirimanPaket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== SISTEM PERHITUNGAN BIAYA PENGIRIMAN PAKET =====");
        System.out.print("Masukkan nama pengirim: ");
        String nama = input.nextLine();

        System.out.print("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan jarak pengiriman (km): ");
        int jarak = input.nextInt();

        System.out.print("Pilih jenis layanan (1=Reguler, 2=Express, 3=Same Day): ");
        int jenisLayanan = input.nextInt();

        System.out.print("Pilih jenis paket (1=Dokumen, 2=Barang Biasa, 3=Barang Elektronik): ");
        int jenisPaket = input.nextInt();

        double biayaDasar = berat * 6500; // contoh per kg
        double biayaJarak = jarak * 600;  // contoh per km
        double subtotal = biayaDasar + biayaJarak;

        double biayaLayanan = 0;
        switch (jenisLayanan) {
            case 1: 
                biayaLayanan = 0;
                break;
            case 2: 
                biayaLayanan = subtotal * 0.5;
                break;
            case 3: 
                biayaLayanan = subtotal * 1.0;
                break;
            default:
                System.out.println("Jenis layanan tidak valid!");
                return;
        }

        double biayaJenisPaket = 0;
        String namaPaket = "";
        switch (jenisPaket) {
            case 1:
                biayaJenisPaket = 5000;
                namaPaket = "Dokumen";
                break;
            case 2:
                biayaJenisPaket = 10000;
                namaPaket = "Barang Biasa";
                break;
            case 3:
                biayaJenisPaket = 15000;
                namaPaket = "Barang Elektronik";
                break;
            default:
                System.out.println("Jenis paket tidak valid!");
                return;
        }

        double totalSebelumDiskon = subtotal + biayaLayanan + biayaJenisPaket;
        double diskon = 0; // bisa ditambah kondisi diskon jika diperlukan
        double totalBiaya = totalSebelumDiskon - diskon;

        // Output hasil
        System.out.println("\n====== BIAYA PENGIRIMAN PAKET ======");
        System.out.println("Nama Pengirim   : " + nama);
        System.out.println("Berat Paket     : " + berat + " kg");
        System.out.println("Jarak Pengiriman: " + jarak + " km");
        System.out.print("Jenis Layanan   : ");
        if (jenisLayanan == 1) System.out.println("Reguler");
        else if (jenisLayanan == 2) System.out.println("Express");
        else System.out.println("Same Day");
        System.out.println("Jenis Paket     : " + namaPaket);

        System.out.println("\n-------------------------------------");
        System.out.printf("Biaya Dasar     : Rp %.0f\n", biayaDasar);
        System.out.printf("Biaya Jarak     : Rp %.0f\n", biayaJarak);
        System.out.printf("Subtotal        : Rp %.0f\n", subtotal);
        System.out.printf("Biaya Layanan   : Rp %.0f\n", biayaLayanan);
        System.out.printf("Biaya Jenis Paket: Rp %.0f\n", biayaJenisPaket);
        System.out.printf("Total Sebelum Disc.: Rp %.0f\n", totalSebelumDiskon);
        System.out.printf("Diskon          : Rp %.0f\n", diskon);
        System.out.println("-------------------------------------");
        System.out.printf("TOTAL BIAYA     : Rp %.0f\n", totalBiaya);
    }
}
