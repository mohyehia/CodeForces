package div2A;
import java.util.Scanner;
public class Sleuth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = removeSpaces(sc.nextLine());
		String vowels = "aeiouyAEIOUY";
		if(vowels.indexOf(s.charAt(s.length() - 2)) != -1)
			System.out.println("YES");
		else System.out.println("NO");
		sc.close();
	}
	static String removeSpaces(String s){
		StringBuilder ss = new StringBuilder();
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) != ' ')
				ss.append(s.charAt(i));
		}
		return ss.toString();
	}
}
