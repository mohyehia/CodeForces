package div2A;
import java.util.Arrays;
import java.util.Scanner;
public class GravityFlip {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		Arrays.sort(a);
		for(int i = 0; i < n - 1; i++) System.out.print(a[i] + " ");
		System.out.println(a[n - 1]);
		sc.close();
	}
}
