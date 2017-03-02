package div2A;
import java.util.Scanner;
public class GoodNumber {
	static String digits = "0123456789";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String[] s = new String[n];
		for(int i = 0; i < n; i++) s[i] = sc.next();
		int count = 0;
		for(int i = 0; i < n; i++){
			if(getMinDigit(s[i]) > k) count++;
		}
		System.out.println(count);
		sc.close();
	}
	static int getMinDigit(String num){
		int i = -1;
		for(i = 0; i < 10; i++){
			if(num.indexOf(digits.charAt(i)) == -1) break;
		}
		return i;
	}
}
