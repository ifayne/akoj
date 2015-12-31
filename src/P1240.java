import java.util.Arrays;
import java.util.Scanner;

public class P1240 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a[] = new int[3];
			int b[] = new int[3];
			for (int i = 0; i < 3; i++) {
				a[i] = cin.nextInt();
			}
			if (a[0] == 0 && a[1] == 0 && a[2] == 0)
				break;
			for (int i = 0; i < 3; i++) {
				b[i] = cin.nextInt();
			}
			if (b[0] == 0 && b[1] == 0 && b[2] == 0)
				break;
			Arrays.sort(a);
			Arrays.sort(b);
			if (a[0] >= b[0] && a[1] >= b[1] && a[2] >= b[2])
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		cin.close();
	}
}
