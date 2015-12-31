
import java.util.Scanner;

public class P1163 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int cA = 0, cO = 0, cJ = 0;
			String s = cin.next();
			if (s.equals("E"))
				break;
			char a[] = s.toCharArray();
			for (int i = 0; i < a.length; i++) {
				if (a[i] == 'A')
					cA++;
				if (a[i] == 'O')
					cO++;
				if (a[i] == 'J')
					cJ++;
			}
			int low = min(cA, cO, cJ);
			for (int i = 0; i < low; i++)
				System.out.print("AOJ");
			while (cA > low || cO > low || cJ > low) {
				if (cA > low) {
					System.out.print("A");
					cA--;
				}
				if (cO > low) {
					System.out.print("O");
					cO--;
				}
				if (cJ > low) {
					System.out.print("J");
					cJ--;
				}
			}
			System.out.println();
		}
		cin.close();
	}

	private static int min(int a, int b, int c) {
		return a < b ? a < c ? a : c : b < c ? b : c;
	}
}
