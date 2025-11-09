package Tugas6_2511532029;
import java.util.Random;
import java.util.Scanner;

public class LemparDadu2_2511532029 {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int tries = 0;
        int sum = 0;
        boolean menang = false;
        boolean lanjut = true;
        
        while (lanjut && !menang) {
            int dadu1 = rand.nextInt(6) + 1;
            int dadu2 = rand.nextInt(6) + 1;
            sum = dadu1 + dadu2;
            tries++;
            
            System.out.println("\n" + dadu1 + " + " + dadu2 + " = " + sum);
          
            if (sum == 7) {
                menang = true;
                System.out.println("Tebakan Anda Benar");
                System.out.println("Anda menang setelah " + tries + " percobaan!");
            } else {
                System.out.println("Tebakan Anda Salah");
                System.out.print("Apakah mau lempar dadu (ya / tidak?) ");
                String jawaban = input.next();
                
                if (!jawaban.equalsIgnoreCase("ya")) {
                    lanjut = false;
                    System.out.println("Anda gagal menang");
                }
            }
        }
        
        input.close();
    	}
    }