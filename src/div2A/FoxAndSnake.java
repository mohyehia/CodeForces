package div2A;
import java.util.Scanner;
public class FoxAndSnake {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		boolean left = false;
		sc.close();
		for(int i = 0; i < n; i++){
			if(i % 2 == 0){
				for(int j = 0; j < m; j++) System.out.print('#');
				System.out.println();
			}
			else{
				if(!left){
					for(int j = 0; j< m - 1; j++){
						System.out.print('.');
					}
					System.out.println('#');
					left = true;
				}else{
					System.out.print('#');
					for(int j = 1; j < m; j++) System.out.print('.');
					System.out.println();
					left = false;
				}
			}
		}
	}
}
