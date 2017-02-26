package div2A;
import java.util.Scanner;
public class SoftDrinking {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt(), l = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt(), p = sc.nextInt(), nl = sc.nextInt(), np = sc.nextInt();
		int numOfMillimiters = (k * l) / nl;
		int numOfLimes = c * d;
		int saltNumber = p / np;
		System.out.println(Math.min(Math.min(numOfMillimiters, numOfLimes), saltNumber) / n);
		sc.close();
	}
}
