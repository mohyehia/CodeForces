package div2A;
import java.util.Scanner;
public class BusToUdayland {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] a = new String[n];
		for(int i = 0; i < n; i++) a[i] = sc.next();
		boolean canSit = false;
		int index = 0;
		String st = "";
		for(int i = 0; i < n; i++){
			if(a[i].contains("OO")){
				canSit = true;
				index = i;
				st = a[i];
				break;
			}
		}
		if(canSit){
			System.out.println("YES");
			a[index] = st.replaceFirst("OO", "++");
			for(String str : a) System.out.println(str);
		}else System.out.println("NO");
		sc.close();
	}
}
