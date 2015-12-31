import java.util.Scanner;

public class P1173 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext())
		{
			int n = cin.nextInt();
			int k = cin.nextInt();
			if (k >= n)
				System.out.println("2");
			else{
				if (2 * n % k == 0)
					System.out.println(2 * n / k);
				else
					System.out.println(2 * n / k + 1);
			}
		}
		cin.close();
	}
}
