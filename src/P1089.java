import java.util.Scanner;

public class P1089 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a[] = new int[3];
			int num = 0;
			boolean first = true;
			for (int i = 0; i < 3; i++) {
				a[i] = cin.nextInt();
				if (a[i] <= 168 && first) {
					num = a[i];
					first = false;
				}
			}
			if (a[1] == -1 && a[0] == -1 && a[2] == -1)
				break;
			if (!first)
				System.out.println("CRASH " + num);
			else
				System.out.println("NO CRASH");
		}
		cin.close();
	}
}
