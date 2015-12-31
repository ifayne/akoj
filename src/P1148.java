import java.util.Scanner;

public class P1148 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int t = cin.nextInt();
			while (t-- > 0) {
				long m = cin.nextLong();
				System.out.println(471 + 1000 * (m - 1));
			}
			
		}
		cin.close();
	}
}
