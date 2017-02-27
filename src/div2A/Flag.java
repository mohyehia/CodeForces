package div2A;
import java.util.Scanner;
public class Flag {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int[][] a = new int[n][m];
		String s = null;
		for(int i = 0; i < n; i++){
			s = sc.next();
			for(int j = 0; j < m; j++) a[i][j] = Integer.parseInt(s.substring(j, j + 1));
		}
		boolean meets = true;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m - 1; j++){
				if(i == n - 1){
					if(a[i][j] != a[i][j + 1]){
						meets = false; break;
					}
				}
				if(i < n - 1){
					if(a[i][j] != a[i][j + 1] || a[i][j] == a[i + 1][j]){
						meets = false; break;
					}
				}
			}
		}
		System.out.println(meets ? "YES" : "NO");
		sc.close();
	}
}
