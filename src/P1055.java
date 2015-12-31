import java.util.Scanner;

public class P1055 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int m = cin.nextInt();
			int n = cin.nextInt();
			if (m == 0 && n == 0) break;
			int a[][] = new int[m][n];
			for (int i=0; i<m; i++)
				for (int j=0; j<n; j++)
					a[i][j] = cin.nextInt();
			int x = cin.nextInt();
			int y = cin.nextInt();
			int b[][] = new int[x][y];
			for (int i=0; i<x; i++)
				for (int j=0; j<y; j++) 
					b[i][j] = cin.nextInt();
			int u = cin.nextInt();
			int v = cin.nextInt();
			int c[][] = new int[u][v];
			for (int i=0; i<u; i++) 
				for (int j=0; j<v; j++)
					c[i][j] = cin.nextInt();
			if (n != x || m != u || y != v)
				System.out.println("No");
			else {
				int sum = 0, j = 0, i = 0;
				for (i=0; i<u; i++) {
					for (j=0; j<v; j++) {
						sum = 0;
						for (int p=0; p<n; p++) {
							sum += a[i][p] * b[p][j];
						}
						if (sum != c[i][j])
							break;
					}
				}
				if (i == u && j == v)
					System.out.println("Yes");
				else
					System.out.println("No");
			}
		}
		cin.close();
	}
}
