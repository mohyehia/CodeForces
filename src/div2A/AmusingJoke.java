package div2A;
import java.util.Scanner;
public class AmusingJoke {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next() + sc.next();
		StringBuilder sb = new StringBuilder(sc.next());
		if(name.length() == sb.length()){
			boolean exists = true;
			int len = name.length();
			for(int i = 0; i < len; i++){
				int index = sb.indexOf(String.valueOf(name.charAt(i)));
				if(index != -1) sb.deleteCharAt(index);
				else{
					exists = false; break;
				}
			}
			if(!exists || sb.length() > 0) System.out.println("NO");
			else System.out.println("YES");
		}else System.out.println("NO");
		sc.close();
	}
}
