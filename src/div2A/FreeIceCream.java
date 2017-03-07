package div2A;
import java.util.Scanner;
public class FreeIceCream {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long x = sc.nextLong();
		int kids = 0, d = 0;
		while(n > 0){
			char ch = sc.next().charAt(0);
			d = sc.nextInt();
			if(ch == '+') x += d;
			else{
				if(x - d >= 0) x -= d;
				else kids++;
			}
			n--;
		}
		System.out.println(x + " " + kids);
		sc.close();
	}
}
