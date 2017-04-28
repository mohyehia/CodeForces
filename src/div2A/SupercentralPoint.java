package div2A;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class SupercentralPoint {
	public static void main(String[] args) {
		out = new PrintWriter(new BufferedOutputStream(System.out));
		Reader in = new Reader();
		int n = in.readInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for(int i = 0; i < n; i++){
			x[i] = in.readInt();
			y[i] = in.readInt();
		}
		int count = 0, left = 0, right = 0, lower = 0, upper = 0;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(x[j] > x[i] && y[j] == y[i]) right++;
				if(x[j] < x[i] && y[j] == y[i]) left++;
				if(x[j] == x[i] && y[j] < y[i]) lower++;
				if(x[j] == x[i] && y[j] > y[i]) upper++;
				if(right >= 1 && left >= 1 && lower >= 1 && upper >= 1){
					count++; break;
				}
			}
			right = left = lower = upper = 0;
		}
		out.println(count);
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