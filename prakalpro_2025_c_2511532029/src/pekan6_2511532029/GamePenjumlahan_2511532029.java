package pekan6_2511532029;
import java.util.*;

public class GamePenjumlahan_2511532029 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Random rand = new Random();
		int points = 0;
		int wrong = 0;
		while (wrong < 3) {
			int result = play(console, rand);
			if (result > 0) {
				points++;
			}else {
				wrong++;
			}
		} 
		System.out.println("You earned "+ points +"total points.");
	}
	public static int play(Scanner console, Random rand) {
		int operands = rand.nextInt(4) + 2;
		int sum = rand.nextInt(10) + 1;
		System.out.println(sum);
		for (int i = 2; i <= operands; i++) {
			int n = rand.nextInt(10) + 1;
			sum += n;
			System.out.println(" + " + n);
		}
		System.out.println(" = ");
		int guees = console.nextInt();
			if (guees == sum) {
				System.out.println("hebat banget sih gantenggggg");
			return 1;
			
			}
		else {
				System.out.println("Wrong! The answer was" + sum);
				return 0;
			}
	}
	

}
