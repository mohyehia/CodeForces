package div2A;
import java.util.Scanner;
public class HQ9Plus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String p = sc.next();
		if(p.indexOf('H') != -1 || p.indexOf('Q') != -1 || p.indexOf('9') != -1) System.out.println("YES");
		else System.out.println("NO");
		sc.close();
	}
}
