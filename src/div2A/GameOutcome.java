package div2A;
import java.util.Scanner;
public class GameOutcome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++) a[i][j] = sc.nextInt();
		}
		int[] rows = new int[n];
		int[] cols = new int[n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				rows[i] += a[i][j];
				cols[i] += a[j][i];
			}
		}
		int count = 0;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++) if(rows[i] < cols[j]) count++;
		}
		System.out.println(count);
		sc.close();
	}
}
