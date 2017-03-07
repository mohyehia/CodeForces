package div2A;
import java.util.Scanner;
public class PlayingWithDice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		int win = 0, draw = 0, lose = 0;
		for(int i = 1; i <= 6; i++){
			if(Math.abs(a - i) < Math.abs(b - i)) win++;
			else if(Math.abs(a - i) > Math.abs(b - i)) lose++;
			else draw++;
		}
		System.out.println(win + " " + draw + " " + lose);
		sc.close();
	}
}
