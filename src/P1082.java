import java.util.Scanner;

public class P1082 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int a[][] = new int[n+2][n+2];
			for (int i=0; i<n+2; i++)
				for (int j=0; j<n+2; j++){
					a[i][j] = 0;
				}
			for (int i=0; i<n+2; i++) {
				a[i][0] = a[i][n+1] = 1;
			}
			for (int j=0; j<n+2; j++) {
				a[0][j] = a[n+1][j] = 1;
			}
			int x = 1, y = 0;
			int count = 1;
			while (count <= n * n) {
				while (y + 1 <= n && a[x][y+1] == 0) a[x][++y] = count++; 
				while (x + 1 <= n && a[x+1][y] == 0) a[++x][y] = count++;
				while (y - 1 >= 1 && a[x][y-1] == 0) a[x][--y] = count++;
				while (x - 1 >= 1 && a[x-1][y] == 0) a[--x][y] = count++;
			}
			for (int i=1; i<=n; i++) {
				for (int j=1; j<=n; j++ ){
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}
		cin.close();
	}
}
