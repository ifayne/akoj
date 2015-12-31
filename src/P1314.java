import java.util.Scanner;

public class P1314 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0) {
			int m = cin.nextInt();
			int n = cin.nextInt();
			System.out.println(f(m, n));
		}
		cin.close();
	}

	private static int f(int m, int n) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (i % m == 0 || h(i, m))
				count++;
		}
		return count;
	}

	private static boolean h(int i, int m) {
		// TODO Auto-generated method stub
		while (i != 0) {
			if (i % 10 == m)
				return true;
			i /= 10;
		}
		return false;
	}

}
