import java.util.Scanner;

public class P1007 {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0) {
			int f = 1, g = 1, s = 1;
			int n = cin.nextInt();
			if (n == 1 || n == 2) {
				System.out.println(f);
			} else {
				while (n-- > 2) {
					s = f + g;
					f = g;
					g = s;
				}
				System.out.println(s);
			}
		}
		cin.close();
	}

}
