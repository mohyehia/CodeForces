package div2A;
import java.util.Scanner;
public class PoliceRecruits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int officers = 0;
		int crimes = 0;
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		sc.close();
		for(int i = 0; i < n; i++){
			if(a[i] == -1 && officers == 0) crimes++;
			else if(a[i] == -1 && officers > 0) officers--;
			else if(a[i] > 0) officers += a[i];
		}
		System.out.println(crimes);
	}
}
