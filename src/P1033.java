import java.util.Scanner;

public class P1033 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0) {
			int n = cin.nextInt();
			int m = cin.nextInt();
			if (m - 2 * n > 0 && (m - 2 * n) % 2 == 0 && 4 * n - m > 0 && (4 * n - m) % 2 == 0) {
				System.out.println((4 * n - m) / 2 + " " + (m - 2 * n) / 2);
			} else {
				System.out.println("No answer");
			}
		}
		cin.close();
	}
}
