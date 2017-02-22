package div2A;
import java.util.HashSet;
import java.util.Scanner;
public class AntonAndLetters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String ss = s.substring(1, s.length() - 1);
		if(ss.trim().length() >= 1){
			String[] a = ss.split(", ");
			HashSet<String> set = new HashSet<>();
			for(int i = 0; i < a.length; i++){
				set.add(a[i]);
			}
			System.out.println(set.size());
			sc.close();
		}else System.out.println(0);
	}
}
