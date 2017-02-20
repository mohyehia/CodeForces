package div2A;
import java.util.Scanner;
public class BeautifulMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int indexI = 0, indexJ = 0;
		int[][] a = {{sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()},
				{sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()},
				{sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()},
				{sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()},
				{sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()}};
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				if(a[i][j] == 1){
					indexI = i; indexJ = j; break;
				}
			}
		}
		System.out.println(Math.abs(2 - indexI) + Math.abs(2 - indexJ));
		sc.close();
	}
}
