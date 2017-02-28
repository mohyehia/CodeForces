package div2A;
import java.util.Scanner;
public class GameWithSticks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		String w = "Malvika";
		while(n > 0 && m > 0){
			if(w == "Malvika") w = "Akshat";
			else w = "Malvika";
			n--; m--;
		}
		System.out.println(w);
		sc.close();
	}
}
