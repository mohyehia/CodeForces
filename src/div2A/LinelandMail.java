package div2A;
import java.util.Scanner;
public class LinelandMail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		int[][] result = new int[n][2];
		for(int i = 0; i < n; i++){
			if(i == 0){
				result[i][0] = Math.abs(a[0] - a[1]);
				result[i][1] = Math.abs(a[n - 1] - a[0]);
			}else if(i == n - 1){
				result[n - 1][0] = Math.abs(a[n - 1] - a[n - 2]);
				result[n - 1][1] = Math.abs(a[n - 1] - a[0]);
			}else{
				result[i][0] = Math.min(Math.abs(a[i] - a[i - 1]), Math.abs(a[i] - a[i + 1]));
				result[i][1] = Math.max(Math.abs(a[i] - a[0]), Math.abs(a[i] - a[n - 1]));
			}
		}
		for(int i = 0; i < n; i++) System.out.println(result[i][0] + " " + result[i][1]);
		sc.close();
	}
}
