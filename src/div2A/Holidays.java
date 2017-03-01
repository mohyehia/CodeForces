package div2A;
import java.util.Scanner;
public class Holidays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = 0, max = 0;
		if(n <= 5){
			min = 0; max = Math.min(2, n);
		}else if(n == 6){
			min = 1; max = 2;
		}else{
			int rem = n % 7;
			if(rem==6){
				min = (n/7)*2 + 1;max = (n/7)*2 + 2;
			}else{
                if(rem >= 2) rem = 2;
                min = (n/7)*2;
                max = (n/7)*2 + rem;
            }
		}
		System.out.println(min + " " + max);
		sc.close();
	}
}
