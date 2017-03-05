package div2A;
import java.util.Scanner;
public class GeorgeAndAccommodation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0, p, q;
		while(n > 0){
			p = sc.nextInt();
			q = sc.nextInt();
			if(q - p >= 2) count++;
			n--;
		}
		System.out.println(count);
		sc.close();
	}
}
