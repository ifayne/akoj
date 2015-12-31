import java.util.Scanner;

public class P1038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int count = 0;
			if (!f(n))
				System.out.println("Unlucky");
			else {
				for (int i = 1; i <= n; i++) {
					if (f(i)) {
						count++;
					}
				}
				System.out.println(count);
			}
		}
		cin.close();
	}

	private static boolean f(int n) {
		// TODO Auto-generated method stub
		while (n != 0) {
			if (n % 10 == 0)
				return false;
			n /= 10;
		}
		return true;
	}
}
