package div2A;
import java.util.Scanner;
public class GregWorkout {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n == 1){
			sc.nextInt();
			System.out.println("chest");
		}else if(n == 2){
			int chest = sc.nextInt();
			int biceps = sc.nextInt();
			System.out.println(chest > biceps ? "chest" : "biceps");
		}else {
			int chestSum = 0, bicepsSum = 0, backSum = 0;
			int[] a = new int[n];
			for(int i = 0; i < n; i++) a[i] = sc.nextInt();
			for(int i = 0; i < n; i += 3) chestSum += a[i];
			for(int i = 1; i < n; i += 3) bicepsSum += a[i];
			for(int i = 2; i < n; i += 3) backSum += a[i];
			int max = Math.max(chestSum, Math.max(bicepsSum, backSum));
			if(max == chestSum) System.out.println("chest");
			if(max == bicepsSum) System.out.println("biceps");
			if(max == backSum) System.out.println("back");
		}
		sc.close();
	}
}
