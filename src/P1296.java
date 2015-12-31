import java.util.Scanner;

public class P1296 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a[][] = new int[3][3];
		int count = 1;
		for (int i=0; i<3; i++)
			for (int j=0; j<3; j++)
				a[i][j] = count++;
		while (cin.hasNext())
		{
			int n = cin.nextInt();
			int s[] = new int[n];
			int cnt = 0;
			for (int i=0; i<n; i++)
			{
				int x = cin.nextInt();
				int y = cin.nextInt();
				s[cnt++] = a[x][y];
			}
			for (int i: s)
				System.out.print(i);
			System.out.println();
		}
		cin.close();
	}
}
