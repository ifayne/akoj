
import java.util.Scanner;

public class P1147 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int t = cin.nextInt();
			while (t-- > 0) {
				String s = cin.next();
				solve(s);
			}
		}
		cin.close();
	}

	private static void solve(String string) {
		char a[] = string.toCharArray();
		int max = 0, sum = 0, i = 0, j = 0;
		for (i = 0; i < a.length; i++) {
			sum = 0;
			for (j = 0; j < a.length; j++) {
				if (i == j)
					continue;
				sum = (a[j] - '0' + sum * 10);
			}
			if (sum > max) {
				max = sum;
			}
		}
		System.out.println(max);
	}
}
