import java.util.Scanner;

public class P1133 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int i = n, j = n;
		for (;;) {
			if (f(i)) {
				System.out.println(i);
				break;
			} else if (f(j)) {
				System.out.println(j);
				break;
			} else {
				i--;
				j++;
			}

		}
		cin.close();
	}

	private static boolean f(int n) {
		// TODO Auto-generated method stub
		if ((int) Math.sqrt((double) n) * (int) Math.sqrt((double) n) == n) {
			return true;
		}
		return false;
	}

}
