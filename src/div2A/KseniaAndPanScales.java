package div2A;
import java.util.Scanner;
public class KseniaAndPanScales {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String sToAdd = sc.next();
		String chars[] = s.split("\\|");
		String left = chars.length > 0 ? chars[0] : "", right = chars.length > 1 ? chars[1] : "";
		int leftCount = left.length(), rightCount = right.length();
		int count = sToAdd.length();
		if(leftCount > rightCount){
			int diff = leftCount - rightCount;
			if(diff > count) System.out.println("Impossible");
			else if(diff == count) System.out.println(left + "|" + right + sToAdd);
			else {
				right += sToAdd.substring(0, diff);
				sToAdd = sToAdd.substring(diff);
				if(sToAdd.length() % 2 != 0) System.out.println("Impossible");
				else{
					for(int i = 0; i < sToAdd.length(); i += 2){
						left += sToAdd.charAt(i);
						right += sToAdd.charAt(i + 1);
					}
					System.out.println(left + "|" + right);
				}
			}
		}else if(leftCount < rightCount){
			int diff = rightCount - leftCount;
			if(diff == count) System.out.println(left + sToAdd + "|" + right);
			else if(diff > count) System.out.println("Impossible");
			else{
				left += sToAdd.substring(0, diff);
				sToAdd = sToAdd.substring(diff);
				if(sToAdd.length() % 2 != 0) System.out.println("Impossible");
				else{
					for(int i = 0; i < sToAdd.length(); i += 2){
						left += sToAdd.charAt(i);
						right += sToAdd.charAt(i + 1);
					}
					System.out.println(left + "|" + right);
				}
			}
		}else {
			if(count % 2 != 0) System.out.println("Impossible");
			else{
				for(int i = 0; i < count; i += 2){
					left += sToAdd.charAt(i);
					right += sToAdd.charAt(i + 1);
				}
				System.out.println(left + "|" + right);
			}
		}
		sc.close();
	}
}
