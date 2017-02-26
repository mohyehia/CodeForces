package div2A;
import java.util.Scanner;
public class Pangram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next().toLowerCase();
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		boolean exists = true;
		if (n < 26)
			System.out.println("NO");
		else {
			for (int i = 0; i < 26; i++) {
				if (s.indexOf(alphabet.charAt(i)) == -1) {
					exists = false;break;
				}
			}
			System.out.println(exists ? "YES" : "NO");
		}
		sc.close();
	}
}
