package div2A;
import java.util.Scanner;
public class VasyaTheHipster {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		int rem = Math.abs((a - b) / 2);
		System.out.println(Math.min(a, b) + " " + rem);
		sc.close();
	}
}
