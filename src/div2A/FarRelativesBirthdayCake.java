package div2A;
import java.util.Scanner;
public class FarRelativesBirthdayCake {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[][] ch = new char[n][n];
		for(int i = 0; i < n; i++){
			String s = sc.next();
			for(int j = 0; j < n; j++) ch[i][j] = s.charAt(j);
		}
		sc.close();
		int happiness = 0, count = 0;
		for(int i = 0; i < n; i++){
			count = 0;
			for(int j = 0; j < n; j++){
				if(ch[i][j] == 'C') count++;
			}
			happiness += count * (count - 1) / 2;
		}
		for(int i = 0; i < n; i++){
			count = 0;
			for(int j = 0; j < n; j++){
				if(ch[j][i] == 'C') count++;
			}
			happiness += count * (count - 1) / 2;
		}
		System.out.println(happiness);
	}
}
