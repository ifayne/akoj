import java.util.Scanner;

public class P1227 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()){
		long n = cin.nextLong();
		System.out.println(f(n));
		}
		cin.close();
	}

	private static long f(long n) {
		// TODO Auto-generated method stub
		return n < 4 ? 1 : f(n-3)+f(n-1);
	}
}
