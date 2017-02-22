package div2A;
import java.util.ArrayList;
import java.util.Scanner;
public class DieRoll {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt(), w = sc.nextInt();
		int dot = (y >= w) ? y : w;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = dot; i <= 6; i++){
			list.add(i);
		}
		if(6 % list.size() == 0) System.out.println(1 + "/" + 6 / list.size());
		else if(list.size() % 2 == 0 && 6 % list.size() != 0) System.out.println(list.size() / 2 + "/" + 3);
		else System.out.println(list.size() + "/" + 6);
		sc.close();
	}
}
