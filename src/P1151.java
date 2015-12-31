import java.util.Scanner;

public class P1151 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			if (n == 0)
				break;
			if (d(n) == h(n) && h(n) == t(n)) {
				System.out.println(n + " is a Sky Number.");
			} else
				System.out.println(n + " is not a Sky Number.");
		}
		cin.close();
	}

	private static int t(int n) {
		// TODO Auto-generated method stub
		int count = 0;
		while (n != 0) {
			count += (n % 12);
			n /= 12;
		}
		return count;
	}

	private static int d(int n) {
		// TODO Auto-generated method stub
		int count = 0;
		while (n != 0) {
			count += (n % 10);
			n /= 10;
		}
		return count;
	}

	private static int h(int n) {
		// TODO Auto-generated method stub
		int count = 0;
		while (n != 0) {
			count += (n % 16);
			n /= 16;
		}
		return count;
	}
}
