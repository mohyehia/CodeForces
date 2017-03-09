package div2A;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
public class RomaAndLuckyNumbers {
	public static void main(String[] args) {
		out = new PrintWriter(new BufferedOutputStream(System.out));
		Reader in = new Reader();
		int n = in.readInt(), k = in.readInt(), count = 0;
		while(n > 0){
			if(numOfLucky(in.readInt()) <= k) count++;
			n--;
		}
		out.println(count);
		out.close();
		in.close();
	}
	static int numOfLucky(int num){
		int count = 0, rem = 0;
		while(num > 0){
			rem = num % 10;
			if(rem == 4 || rem == 7) count++;
			num /= 10;
		}
		return count;
	}
	static PrintWriter out;
	static class Reader {
		BufferedReader br;
		StringTokenizer st;
		public Reader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String read() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		int readInt() {return Integer.parseInt(read());}
		long readLong() {return Long.parseLong(read());}
		double readDouble() {return Double.parseDouble(read());}
		char readChar() {return read().charAt(0);}
		String readLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
		void close() {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
