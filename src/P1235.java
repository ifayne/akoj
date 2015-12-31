import java.util.Scanner;

public class P1235 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			if (f(a) > f(b))
				System.out.println(">");
			else if (f(a) < f(b))
				System.out.println("<");
			else
			{
				if (a == b)
					System.out.println("=");
				else if (a < b)
					System.out.println("<");
				else 
					System.out.println(">");
			}
		}
		cin.close();
	}

	private static int f(int a) {
		return a < 2 ? a : f(a / 2) + a % 2;
	}
}
