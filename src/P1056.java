import java.util.Scanner;

public class P1056 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a[] = new int[6];
			for (int i = 0; i < 6; i++) {
				a[i] = cin.nextInt();
			}
			if (a[0] == a[1] && a[1] == a[2] && a[2] == a[3] && a[3] == a[4] && a[4] == a[5] && a[0] == 0)
				break;
			int t = (a[2] - a[0]) * (a[5] - a[1]) - (a[3] - a[1]) * (a[4] - a[0]);
			if (t > 0)
				System.out.println("0");
			else
				System.out.println("1");
		}
		cin.close();
	}
}
