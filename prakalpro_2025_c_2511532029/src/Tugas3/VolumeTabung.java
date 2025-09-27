package Tugas3;
import java.util.Scanner;

public class VolumeTabung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r, t, volume;
        final double PI = 3.14;

        System.out.print("Masukkan jari-jari tabung: ");
        r = scanner.nextDouble();

        System.out.print("Masukkan tinggi tabung: ");
        t = scanner.nextDouble();

        volume = PI * r * r * t;

        System.out.println("Volume tabung = " + volume);

        scanner.close();
    }
}
