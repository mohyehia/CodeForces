package div2A;
import java.util.Scanner;
public class Coder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n % 2 == 0 ? n * n / 2 : n * n / 2 + 1);
		String s1 = "", s2 = "";
		for (int i = 0; i < n; i++) {
			s1 += i % 2 == 0 ? "C" : ".";
			s2 += i % 2 == 0 ? "." : "C";
		}
		for (int i = 0; i < n; i++) {
			System.out.println(i % 2 == 0 ? s1 : s2);
		}
		sc.close();
	}
}
