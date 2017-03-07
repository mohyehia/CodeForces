package div2A;
import java.util.Scanner;
public class WayTooLongWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] a = new String[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.next();
			if(a[i].length() > 10) 
				a[i] = "" + a[i].charAt(0) + (a[i].length() - 2) + a[i].charAt(a[i].length() - 1);
		}
		for(String s : a) System.out.println(s);
		sc.close();
	}
}
