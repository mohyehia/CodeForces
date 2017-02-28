package div2A;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ToyCars {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		for(int i= 0; i < n; i++){
			for(int j = 0; j < n; j++) a[i][j] = sc.nextInt();
		}
		boolean good = true;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i= 0; i < n; i++){
			good = true;
			for(int j = 0; j < n; j++){
				if(a[i][j] == 1 || a[i][j] == 3) {
					good = false; break;
				}
			}
			if(good) list.add(i + 1);
		}
		System.out.println(list.size());
		if(list.size() > 0){
			Collections.sort(list);
			for(int h = 0; h < list.size(); h++) System.out.print(list.get(h) + " ");
		}
		sc.close();
	}
}
