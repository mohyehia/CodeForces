package div2A;
import java.util.Scanner;
public class VanyaAndFence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = sc.nextInt();
		int sum = 0;
		while(n > 0){
			if(sc.nextInt() > h) sum += 2;
			else sum++;
			n--;
		}
		System.out.println(sum);
		sc.close();
	}
}
