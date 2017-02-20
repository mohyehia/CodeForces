package div2A;
import java.util.Scanner;
public class Team {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int numOfProblems = 0;
		while(n > 0){
			int[] a = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
			if(sum(a) >= 2) numOfProblems++;
			n--;
		}
		System.out.println(numOfProblems);
		sc.close();
	}
	static int sum(int[] a){
		int sum = 0;
		for(int i = 0; i < a.length; i++){
			sum += a[i];
		}
		return sum;
	}
}
