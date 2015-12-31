import java.util.Scanner;

public class P1345 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			double a = cin.nextDouble();
			System.out.println(String.format("%.3f", 3 * Math.sqrt(3) * Math.pow(a, 2) / 2.0));
		}
		cin.close();
	}
}
