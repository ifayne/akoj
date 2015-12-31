import java.util.Scanner;

public class P1168 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0)
		{
			long h = cin.nextLong();
			System.out.printf("%d\n", h <= 10 ? 1 : h % 5 == 1 ? h / 5 : h / 5 - 1);
		}
		cin.close();
	}
}
