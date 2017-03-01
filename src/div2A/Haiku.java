package div2A;
import java.util.Scanner;
public class Haiku {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String p1 = sc.nextLine().trim(), p2 = sc.nextLine().trim(), p3 = sc.nextLine().trim();
		int sum1 = 0, sum2 = 0, sum3 = 0;
		sc.close();
		for(int i = 0; i < p1.length(); i++){
			char ch = p1.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') sum1++;
		}
		if(sum1 != 5){System.out.println("NO"); return;}
		for(int i = 0; i < p2.length(); i++){
			char ch = p2.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') sum2++;
		}
		if(sum2 != 7){System.out.println("NO"); return;}
		for(int i = 0; i < p3.length(); i++){
			char ch = p3.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') sum3++;
		}
		if(sum3 != 5) System.out.println("NO");
		else System.out.println("YES");
	}
}
