import java.util.Scanner;

public class P1234 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0)
		{
			double a = cin.nextDouble();
			double b = cin.nextDouble();
			if ( b == 0 )
				System.out.println("INF");
			else {
				System.out.printf("%.4f\n", a/b);
			}
		}
		cin.close();
	}
}
