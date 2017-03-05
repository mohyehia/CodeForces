package div2A;
import java.util.Scanner;
public class Elephant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		if(x <= 5) System.out.println(1);
		else{
			int rem = x % 5;
			System.out.println(rem == 0 ? x / 5 : x / 5 + 1);
		}
	}
}
