package div2A;
import java.util.Scanner;
public class StonesOnTheTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();
		int count = 0;
		for(int i = 1; i < n; i++){
			if(s.charAt(i) == s.charAt(i - 1)) count++;
		}
		System.out.println(count);
	}
}
