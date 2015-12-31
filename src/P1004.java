import java.util.Arrays;
import java.util.Scanner;

public class P1004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int count = cin.nextInt();
		while (count-- > 0) {
			int n = cin.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = cin.nextInt();
			}

			Arrays.sort(a);
			if (n == 1)
				System.out.println("yes");
			else {
				int d = a[1] - a[0], p = 1;
				for (int i = 1; i < n; i++) {
					if (a[i] - a[i - 1] != d) {
						System.out.println("no");
						p = 0;
						break;
					}
				}
				if (p == 1)
					System.out.println("yes");
			}
		}
		cin.close();
	}

}
