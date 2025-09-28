package Tugas2ilearn;

import java.util.Scanner;
public class HitungUpahKaryawan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama karyawan: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan golongan (A/B/C/D): ");
        char golongan = scanner.next().charAt(0);

        System.out.print("Masukkan jam kerja per minggu: ");
        int jamKerja = scanner.nextInt();

        int upahPerJam = 0;
        if (golongan == 'A' || golongan == 'a') {
            upahPerJam = 1000;
        } else if (golongan == 'B' || golongan == 'b') {
            upahPerJam = 2000;
        } else if (golongan == 'C' || golongan == 'c') {
            upahPerJam = 3000;
        } else if (golongan == 'D' || golongan == 'd') {
            upahPerJam = 4000;
        } else {
            System.out.println("Golongan tidak valid!");
            scanner.close();
            return;
        }

        int upahNormal = jamKerja * upahPerJam;
        int totalUpah = upahNormal;

        if (jamKerja > 60) {
            int jamLembur = jamKerja - 60;
            int upahLembur = jamLembur * 5000;
            totalUpah = upahNormal + upahLembur;
        }

        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Golongan: " + golongan);
        System.out.println("Jam Kerja: " + jamKerja + " jam");
        System.out.println("Upah Mingguan: Rp " + totalUpah);

        scanner.close();
    }
}
