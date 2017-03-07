package div2A;
import java.util.HashSet;
import java.util.Scanner;
public class BeautifulYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		sc.close();
		for(int i = y + 1; i <= Integer.MAX_VALUE; i++){
			if(distinct(i)){
				System.out.println(i);
				System.exit(0);
			}
		}
	}
	static boolean distinct(int year){
		HashSet<Integer> set = new HashSet<>();
		int rem = 0;
		while(year > 0){
			rem = year % 10;
			set.add(rem);
			year /= 10;
		}
		if(set.size() < 4) return false;
		else return true;
	}
}
