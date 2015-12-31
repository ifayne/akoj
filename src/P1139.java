import java.util.Scanner;

public class P1139 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0) {
			int a = cin.nextInt(), b = cin.nextInt();
			System.out.println((a + b) * (a + b + 1) / 2 + a + 1);
		}
		cin.close();
	}
}
