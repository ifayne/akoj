
import java.util.Scanner;

public class P1077 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			long a = cin.nextLong();
			long b = cin.nextLong();
			long x = a <= b ? a : b;
			long y = a > b ? a : b;
			
			System.out.println(a+" "+b+" "+max(x, y));
		}
		cin.close();
	}

	private static long max(long a, long b) {
		long max = 0;
		for (long i=a; i<=b; i++){
			if (cycle(i) > max)
				max = cycle(i);
		}
		return max;
	}

	private static long cycle(long n) {
		long count = 1;
		while (n != 1) {
			if (n % 2 == 1)
				n = 3 * n + 1;
			else 
				n /= 2;
			count++;
		}
		return count;
	}
}
