package div2A;
import java.util.Scanner;
import java.util.TreeSet;
public class SecondOrderStatistics {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeSet<Integer> set = new TreeSet<>();
		for(int i = 0; i < n; i++){
			set.add(sc.nextInt());
		}
		if(set.size() < 2) System.out.println("NO");
		else {
			for(Integer i : set){
				if(i == set.first()) continue;
				else{
					System.out.println(i);
					break;
				}
			}
		}
		sc.close();
	}
}
