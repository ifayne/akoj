import java.util.Scanner;

public class P1165 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			System.out.println(f(a, b));
		}
		cin.close();
	}

	private static int f(int a, int b) {
		return a * (a + 1) * b * (b + 1) / 4;
	}
}
