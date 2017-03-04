package div2A;
import java.util.Scanner;
public class ChewbAndNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder sb = new StringBuilder("");
		int num = 0;
		for(int i = 0; i < s.length(); i++){
			num = Character.getNumericValue(s.charAt(i));
			if(i == 0 && num == 9) sb.append(String.valueOf(num));
			else if(num > 4) sb.append(String.valueOf(9 - num));
			else sb.append(String.valueOf(num));
		}
		System.out.println(sb);
		sc.close();
	}
}
