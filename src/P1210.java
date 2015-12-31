import java.util.Scanner;

public class P1210 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String s = cin.nextLine();
			char a[] = s.toCharArray();
			for (int i = 0; i < s.length() - 1; i++) {
				for (int j = i + 1; j < s.length(); j++) {
					if (a[j] == a[i]) {
						a[j] = 'p';
					}
				}
			}

			for (int i = 0; i < s.length(); i++) {
				if (a[i] != 'p' && a[i] != ' ')
					System.out.print(a[i] + " ");
			}
			System.out.println();
		}
		cin.close();
	}
}
