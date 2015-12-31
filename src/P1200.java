import java.util.Scanner;

public class P1200 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int t = cin.nextInt();
			while (t-- > 0) {
				int x = cin.nextInt();
				int y = cin.nextInt();
				int z = cin.nextInt();
				if ((x + y - z) % 2 == 0 && (x + z - y) % 2 == 0 && (y + z - x) % 2 == 0) {
					int a = (x + y - z) / 2;
					int b = (x + z - y) / 2;
					int c = (y + z - x) / 2;
					if (a > 0 && b > 0 && c > 0) {
						System.out.println(a + " " + b + " " + c);
					} else
						System.out.println("Impossible");
				} else
					System.out.println("Impossible");
			}
		}
		cin.close();
	}

}
