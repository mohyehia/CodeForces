package div2A;
import java.util.Scanner;
public class EvenOdds {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong(), k = sc.nextLong();
		long oddNums = (n % 2 == 0) ? n / 2 : n / 2 + 1;
		if(k <= oddNums) System.out.println(2 * k - 1);
		else System.out.println((k - oddNums) * 2);
		sc.close();
	}
}
