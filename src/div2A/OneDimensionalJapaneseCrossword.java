package div2A;
import java.util.ArrayList;
import java.util.Scanner;
public class OneDimensionalJapaneseCrossword {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String st = sc.next();
		char[] s = st.toCharArray();
		ArrayList<Integer> list = new ArrayList<>();
		int j = 0, count = 0;
		for(int i = 0; i < n; i++){
			if(s[i] == 'B'){
				j = i;
				while(j < n && s[j] == 'B') {j++; count++;}
				if(count > 0) list.add(count);
				i = j; count = 0;
			}
		}
		if(list.size() > 0) {
			System.out.println(list.size());
			for(int num : list) System.out.print(num + " ");
		}else System.out.println(0);
		sc.close();
	}
}
