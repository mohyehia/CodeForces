package div2A;
import java.util.Scanner;
public class Keyboard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char dir = sc.next().charAt(0);
		String s = sc.next();
		String alphabet = "qwertyuiopasdfghjkl;zxcvbnm,./";
		StringBuilder sb = new StringBuilder();
		if(dir == 'R'){
			for(int i = 0; i < s.length(); i++){
				if(alphabet.indexOf(s.charAt(i)) == 0) sb.append(alphabet.charAt(29));
				else{
					sb.append(alphabet.charAt(alphabet.indexOf(s.charAt(i)) - 1));
				}
			}
		}else if(dir == 'L') {
			for(int i = 0; i < s.length(); i++){
				if(alphabet.indexOf(s.charAt(i)) == 29) sb.append(alphabet.charAt(0));
				else{
					sb.append(alphabet.charAt(alphabet.indexOf(s.charAt(i)) + 1));
				}
			}
		}
		System.out.println(sb.toString());
		sc.close();
	}
}
