import java.util.Scanner;

public class P1260 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			int c = cin.nextInt();
			if (a == 0 && b == 0)
				System.out.println("Abnormal!");
			else {
				int delta = b * b - 4 * a * c;
				if (delta > 0 && a != 0)
					System.out.println("2");
				else if (delta == 0 || a == 0)
					System.out.println("1");
				else {
					System.out.println("0");
				}

			}
		}
		cin.close();
	}
}
