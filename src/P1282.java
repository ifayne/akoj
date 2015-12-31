import java.util.Scanner;

public class P1282 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0) {
			String s1 = cin.next();
			int x = cin.nextInt();
			char a[] = s1.toCharArray();
			System.out.println(f(a[0]) + x);
		}
		cin.close();
	}

	private static int f(char ch) {
		if (ch >= 'A' && ch <= 'Z')
			return ch - 'A' + 1;
		else
			return -(ch - 'a' + 1);
	}
}
