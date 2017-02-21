package div2A;
import java.util.Scanner;
public class NightAtTheMuseum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		int len = alpha.length();
		int sum = 0;
		int distance = 0;
		int rotation = 0;
		for(int i = 0; i < s.length(); i++){
			if(i == 0){
				rotation = Math.abs(len - alpha.indexOf(s.charAt(i)));
				if(rotation > alpha.indexOf(s.charAt(i))) sum += alpha.indexOf(s.charAt(i));
				else sum += rotation;
			}else{
				distance = Math.abs(alpha.indexOf(s.charAt(i)) - alpha.indexOf(s.charAt(i - 1)));
				rotation = len - distance;
				if(distance < rotation) sum += distance;
				else sum += rotation;
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
