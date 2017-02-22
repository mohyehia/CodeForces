package div2A;
import java.util.Scanner;
public class NearlyLuckyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		String s = String.valueOf(n);
		int len = s.length();
		int count = 0;
		for(int i = 0; i < len; i++){
			if(s.charAt(i) == '4' || s.charAt(i) == '7') count++;
		}
		if(isLucky(count)) System.out.println("YES");
		else System.out.println("NO");
		sc.close();
	}
	static boolean isLucky(int num){
		boolean lucky = false;
		String s = String.valueOf(num);
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == '4' || s.charAt(i) == '7') lucky = true;
			else{
				lucky = false;
				break;
			}
		}
		return lucky;
	}
}
