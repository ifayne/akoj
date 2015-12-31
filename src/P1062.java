import java.util.Scanner;

public class P1062 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int t = cin.nextInt();
			while (t-- > 0) {
				double n = cin.nextDouble();
				double a = n * Math.log10(n);
				System.out.printf("%d\n", (int) Math.pow(10.0, a - (long)a));
			}
		}
		cin.close();
	}
}
