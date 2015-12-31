import java.util.Scanner;

public class P1194 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int t = cin.nextInt();
			while (t-- > 0)  {
				int n = cin.nextInt();
				int a = cin.nextInt();
				int b = cin.nextInt();
				int floor[] = new int[n];
				floor[0] = 0;
				for (int i=1; i<n; i++) {
					floor[i] = cin.nextInt();
				}
				int low = a < b ? a : b;
				int high = a > b ? a : b;
				int sum = 0;
				for (int i=low+1; i<=high; i++)
					sum += floor[i-1];
				System.out.println(sum);
			}
		}
		cin.close();
	}
}
