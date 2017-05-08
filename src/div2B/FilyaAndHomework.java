package div2B;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class FilyaAndHomework {
	public static void main(String[] args) {
		out = new PrintWriter(new BufferedOutputStream(System.out));
		Reader in = new Reader();
		int n = in.readInt();
		Set<Integer> set = new TreeSet<>();
		while(n > 0){
			set.add(in.readInt());
			n--;
		}
		if(set.size() == 1 || set.size() == 2) out.println("YES");
		else if(set.size() >= 4) out.println("NO");
		else if(set.size() == 3){
			Object[] a = set.toArray();
			if(2 * (int)a[1] == (int)a[0] + (int)a[2])
				out.println("YES");
			else out.println("NO");
		}
		in.close();
		out.close();
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
		int readInt() {
			return Integer.parseInt(read());
		}
		long readLong() {
			return Long.parseLong(read());
		}
		double readDouble() {
			return Double.parseDouble(read());
		}
		char readChar() {
			return read().charAt(0);
		}
		int[] readIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = readInt();
			return a;
		}
		long[] readLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = readLong();
			return a;
		}
		double[] readDoubleArray(int n) {
			double[] a = new double[n];
			for (int i = 0; i < n; i++)
				a[i] = readDouble();
			return a;
		}
		String[] readStringArray(int n) {
			String[] s = new String[n];
			for (int i = 0; i < n; i++)
				s[i] = read();
			return s;
		}
		char[] readCharArray(int n) {
			char[] ch = new char[n];
			for (int i = 0; i < n; i++)
				ch[i] = readChar();
			return ch;
		}
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
