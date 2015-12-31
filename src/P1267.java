import java.util.Arrays;
import java.util.Scanner;

public class P1267 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- >= 0) {
			int w = cin.nextInt();
			int n = cin.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = cin.nextInt();
			Arrays.sort(a);
			int count = 0;
			for (int i = 0, j = a.length - 1;;) {
				if (a[i] + a[j] <= w) {
					count++;
					i++;
					j--;
				} else if (a[i] + a[j] > w) {
					count++;
					j--;
				}
				if (i == j - 1) {
					if (a[i] + a[j] <= w)
						count++;
					else
						count += 2;
					break;
				}
			}
			System.out.println(count);
		}
		cin.close();
	}
}
