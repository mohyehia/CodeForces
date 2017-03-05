package div2A;
import java.util.Arrays;
import java.util.Scanner;
public class MeetingFriends {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		Arrays.sort(a);
		System.out.println((a[1] - a[0]) + (a[2] - a[1]));
		sc.close();
	}
}
