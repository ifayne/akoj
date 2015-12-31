import java.util.Scanner;

public class P1338 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0)
		{
			double n = cin.nextDouble();
			System.out.println(String.format("%.2f%%", n*100));
		}
		cin.close();
	}
}
