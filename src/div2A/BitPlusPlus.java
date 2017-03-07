package div2A;
import java.util.Scanner;
public class BitPlusPlus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), x = 0;
		while(n > 0){
			if(sc.next().contains("+")) x++;
			else x--;
			n--;
		}
		System.out.println(x);
		sc.close();
	}
}
