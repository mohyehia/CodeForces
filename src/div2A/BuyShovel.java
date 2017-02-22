package div2A;
import java.util.Scanner;
public class BuyShovel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(), r = sc.nextInt();
		int shovel = k;
		int count = 0;
		while(k > 0){
			if(shovel % 10 != 0 && shovel % 10 != r){
				count++; shovel += k;
			}else{
				count++; break;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
