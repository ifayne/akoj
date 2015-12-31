import java.util.Scanner;

public class P1091 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext() && cin.hasNext()) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			System.out.println(f(f(a) * f(b)));
		}
		cin.close();
	}

	private static int f(int a) {
		// TODO Auto-generated method stub
		int n = 0;
		while (a != 0) {
			n = n * 10 + (a % 10);
			a /= 10;
		}
		return n;
	}
}
