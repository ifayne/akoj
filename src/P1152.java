import java.util.Scanner;

public class P1152 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext() && cin.hasNext()) {
			int n = cin.nextInt();
			int b = cin.nextInt();
			System.out.println(f(n, b));
		}
		cin.close();
	}

	private static int f(int n, int b) {
		// TODO Auto-generated method stub
		int result = 0;
		for (int i = 1; i <= n;) {
			if (i % b == 0) {
				result++;
				i += b;
			} else
				i++;
		}
		return result;
	}
}
