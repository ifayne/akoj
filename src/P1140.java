import java.util.Scanner;

public class P1140 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int m = cin.nextInt();
			if (m == 0 && n == 0)
				break;
			int hero[] = new int[n+1];
			for (int i=1; i<=n; i++)
				hero[i] = 0;
			int count = 0;
			for (int i=0; i<m; i++) {
				int a = cin.nextInt();
				int b = cin.nextInt();
				if (hero[a] == 0 && hero[b] == 0)
					hero[a] = hero[b] = ++count;
				else
					hero[a] = hero[b] = count;
			}
			for (int i=1; i<=n; i++)
				if (hero[i] == 0)
					count++;
			System.out.println(count);
		}
		cin.close();
	}
}
