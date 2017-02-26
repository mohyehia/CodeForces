package div2A;
import java.util.Scanner;
public class CircleLine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		int s = sc.nextInt() - 1;
		int t = sc.nextInt() - 1;
		int sum1 = 0, sum2 = 0;
		int begin = Math.min(s, t);
		int end = Math.max(s, t);
		for(int i = begin; i < end; i++) sum1 += a[i];
		for(int i = end; i < n; i++) sum2 += a[i];
		for(int i = 0; i < begin; i++) sum2 += a[i];
		System.out.println(sum1 < sum2 ? sum1 : sum2);
		sc.close();
	}
}
