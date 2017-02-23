package div2A;
import java.util.Scanner;
public class GoodContest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int before = 0, after = 0;
		String name = null;
		boolean good = false;
		while(n > 0){
			name = sc.next();
			before = sc.nextInt();
			after = sc.nextInt();
			if(before >= 2400){
				if(after > before) good = true;
			}
			n--;
		}
		System.out.println(good ? "YES" : "NO");
		sc.close();
	}
}
