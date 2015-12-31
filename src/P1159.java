import java.util.Scanner;

public class P1159 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String s = cin.next();
			print(s);
		}
		cin.close();
	}

	private static void print(String s) {
		// TODO Auto-generated method stub
		char a[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (a[i] >= 'a' && a[i] <= 'c')
				System.out.print("2");
			if (a[i] >= 'd' && a[i] <= 'e')
				System.out.print("3");
			if (a[i] >= 'g' && a[i] <= 'i')
				System.out.print("4");
			if (a[i] >= 'j' && a[i] <= 'l')
				System.out.print("5");
			if (a[i] >= 'm' && a[i] <= 'o')
				System.out.print("6");
			if (a[i] >= 'p' && a[i] <= 's')
				System.out.print("7");
			if (a[i] >= 't' && a[i] <= 'v')
				System.out.print("8");
			if (a[i] >= 'w' && a[i] <= 'z')
				System.out.print("9");
		}
		System.out.println();
	}
}
