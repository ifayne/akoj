import java.util.Scanner;

public class P1011 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int a[] = new int[n * n + 1];
		int count = 1;
		while (cin.hasNext() && cin.hasNext()) {
			int x = cin.nextInt();
			int y = cin.nextInt();
			if (x == 0 && y == 0)
				break;
			for (int i = 0; i < y; i++) {
				a[count++] = x;
			}
		}
		for (int i = 1; i <= n * n; i++) {
			System.out.print(a[i] + " ");
			if (i % n == 0)
				System.out.println();
		}
		cin.close();
	}

}
