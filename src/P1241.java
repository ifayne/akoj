import java.util.Scanner;

public class P1241 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0) {
			int x = cin.nextInt();
			int y = cin.nextInt();
			int a = cin.nextInt();
			int b = cin.nextInt();
			int m = cin.nextInt();
			int result = x + y;
			if (m == 1)
				result = x;
			if (m == 2)
				result = x + y;
			while (m-- > 2) {
				int tmp = (a * x + b * y);
				x = y;
				y = tmp;
				result += tmp;
			}
			System.out.println(result);
		}
		cin.close();
	}
}
