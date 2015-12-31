import java.util.Scanner;

public class P1221 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0) {
			int b = cin.nextInt();
			int a = cin.nextInt();
			int s = 0;
			while (a != 0) {
				s += (a % b);
				a /= b;
			}
			System.out.println(s % (b + 1));
		}
		cin.close();
	}
}
