package div2A;
import java.util.Scanner;
public class SoldierAndBananas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(), n = sc.nextInt(), w = sc.nextInt();
		int money = 0;
		for(int i = 1; i <= w; i++) money += i * k;
		System.out.println(money > n ? (money - n) : 0);
		sc.close();
	}
}
