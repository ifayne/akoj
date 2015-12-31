import java.util.Scanner;

public class P1022 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int m = cin.nextInt();
			int n = cin.nextInt();
			int a[][] = new int[m + 2][n + 2];
			for (int i = 0; i < m + 2; i++)
				a[i][0] = a[i][n + 1] = 0;
			for (int j = 0; j < n + 2; j++)
				a[0][j] = a[m + 1][j] = 0;
			for (int i = 1; i <= m; i++) {
				for (int j = 1; j <= n; j++) {
					a[i][j] = cin.nextInt();
				}
			}
			int count = 1;
			boolean judge = false;
			for (int i = 1; i <= m; i++) {
				for (int j = 1; j <= n; j++) {
					if (a[i][j] != 0) {
						if (a[i - 1][j] != 0 || a[i + 1][j] != 0 || a[i][j + 1] != 0 || a[i][j - 1] != 0
								|| a[i - 1][j - 1] != 0 || a[i - 1][j + 1] != 0 || a[i + 1][j - 1] != 0
								|| a[i + 1][j + 1] != 0)
							a[i][j] = count;
						else {
							a[i][j] = ++count;
						}
						judge = true;
					}else {
						
					}
				}
			}
			if (!judge)
				System.out.println(100);
			else 
				System.out.println(100 - 10 * count);
		}
		cin.close();
	}

}
