import java.util.Scanner;

public class P1294 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int t = cin.nextInt();
			while (t-- > 0) {
				String num = cin.next();
				int m = cin.nextInt();
				int k = cin.nextInt();
				char a[] = new char[m];
				for (int i = 0; i < a.length; i++)
					a[i] = '9';
				String newNum = new String(a) + num;
				solve(newNum, k);
			}
		}
		cin.close();
	}

	private static void solve(String num, int k) {
		while (k-- > 0)
			num = f(num);
		System.out.println(num);
	}

	private static String f(String num) {
		char a[] = num.toCharArray();
		long sum = 0, max = 0;
		for (int i = 0; i < a.length; i++) {
			sum = 0;
			for (int j = 0; j < a.length; j++) {
				if (i != j) {
					sum = a[j] - '0' + sum * 10;
				}
			}
			if (sum > max)
				max = sum;
		}
		return String.valueOf(max);
	}
}
