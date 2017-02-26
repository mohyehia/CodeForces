package div2A;
import java.util.Scanner;
import java.util.ArrayList;
public class TeamOlympiad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		ArrayList<Integer> ones = new ArrayList<>();
		ArrayList<Integer> twos = new ArrayList<>();
		ArrayList<Integer> threes = new ArrayList<>();
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
			if(a[i] == 1) ones.add(i + 1);
			if(a[i] == 2) twos.add(i + 1);
			if(a[i] == 3) threes.add(i + 1);
		}
		int w = Math.min(Math.min(ones.size(), twos.size()), threes.size());
		System.out.println(w);
		sc.close();
		if(w == 0) return;
		for(int i = 0; i < w; i++){
			System.out.print(ones.get(i) + " " + twos.get(i) + " " + threes.get(i) + "\n");
		}
	}
}
