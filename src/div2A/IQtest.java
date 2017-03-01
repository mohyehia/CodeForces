package div2A;
import java.util.Scanner;
public class IQtest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int evenCount = 0, oddCount = 0, evenIndex = 0, oddIndex = 0;
		for(int i = 0; i < n; i++){
			if(sc.nextInt() % 2 == 0){
				evenCount++; evenIndex = i + 1;
			}else{
				oddCount++; oddIndex = i + 1;
			}
		}
		System.out.println(oddCount < evenCount ? oddIndex : evenIndex);
		sc.close();
	}
}
