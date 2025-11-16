package Tugas7_2511532029;
import java.util.Scanner;

public class tugasAlproPekan7_2511532029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- REGISTRASI AKUN BARU ---");
        
        System.out.print("Masukkan Username: ");
        String username = scanner.nextLine();
        
        System.out.print("Masukkan Password: ");
        String password = scanner.nextLine();
        
        System.out.print("Masukkan Email: ");
        String email = scanner.nextLine();
        
        System.out.print("Masukkan PIN (6 digit): ");
        int pin = scanner.nextInt();
        
        Akun_2511532029 akun = new Akun_2511532029(username, password, email, pin);
        

        if (!akun.isPasswordValid() || !akun.isEmailValid()) {
            System.out.println("\n--- REGISTRASI GAGAL ---");
            
            if (!akun.isPasswordValid()) {
                System.out.println("Password harus 8 karakter atau lebih.");
            }
            
            if (!akun.isEmailValid()) {
                System.out.println("Email Anda \"" + akun.getEmail() + "\" tidak valid (harus mengandung '@' dan '.').");
            }
            
            System.out.println("Silakan coba lagi.");
        } else {
            System.out.println("\n--- REGISTRASI BERHASIL ---");
            System.out.println("Akun untuk \"" + akun.getUsername() + "\" telah berhasil dibuat.");
            
            System.out.println("\n--- Detail Akun ---");
            System.out.println("Username (Lowercase): " + akun.getUsername().toLowerCase());
            System.out.println("Email (Uppercase) : " + akun.getEmail().toUpperCase());
            System.out.println("ID Pengguna (Gabungan): " + akun.getIdPengguna());
            
            System.out.println("\n--- Uji Tipe Data (PIN Anda: " + akun.getPinAngka() + ") ---");
            System.out.println("PIN (int) + 10 = " + (akun.getPinAngka() + 10));
            System.out.println("PIN (String) + \"10\" = " + String.valueOf(akun.getPinAngka()) + "10");
        }
        
        scanner.close();
    }
}
