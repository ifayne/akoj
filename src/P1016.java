import java.util.Scanner;

public class P1016 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int m = cin.nextInt();
			if (m == 0 && n == 0)
				break;
			int computer[] = new int[n+1];
			for (int i=1; i<=n; i++)
				computer[i] = 0;
			int count = 0;
			for (int i=0; i<m; i++) {
				int a = cin.nextInt();
				int b = cin.nextInt();
				if (computer[a] == 0 && computer[b] == 0)
					computer[a] = computer[b] = ++count;
				else
					computer[a] = computer[b] = count;
			}
			for (int i=1; i<=n; i++)
				if (computer[i] == 0)
					count++;
			System.out.println(count-1);
		}
		cin.close();
	}
}
