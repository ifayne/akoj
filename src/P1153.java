import java.util.Scanner;

public class P1153 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0) {
			int n = cin.nextInt();
			int p = cin.nextInt();
			int sum = 0;
			for (int i = 1; i <= n; i++) {
				sum += pow(i, p);
			}
			System.out.println(sum % 10003);
		}
		cin.close();
	}

	private static int pow(int i, int p) {
		i %= 10003;
		if ( i == 0)
			return 0;
		if (p == 0 || i == 1)
			return 1;
		if (p % 2 == 0)
			return pow(i*i, p/2) % 10003;
		else 
			return pow(i*i, p/2)*i % 10003;
	}

}
