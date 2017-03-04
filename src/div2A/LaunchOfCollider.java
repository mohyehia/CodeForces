package div2A;
import java.util.Scanner;
import java.util.TreeSet;
public class LaunchOfCollider {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		sc.close();
		TreeSet<Integer> set = new TreeSet<>();
		for(int i = 0; i < n - 1; i++){
			if(s.charAt(i) == 'R' && s.charAt(i + 1) == 'L'){
				set.add((a[i + 1] - a[i]) / 2);
			}
		}
		if(set.size() > 0) System.out.println(set.first());
		else System.out.println(-1);
	}
}
