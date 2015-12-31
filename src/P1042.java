import java.util.Scanner;

public class P1042 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String s1 = cin.next();
		String op = cin.next();
		String s2 = cin.next();
		if (op.equals("+")) {
			print(toDec(s1) + toDec(s2));
		} else {
			print(toDec(s1) - toDec(s2));
		}
		cin.close();
	}

	private static void print(int n) {
		// TODO Auto-generated method stub
		int a[] = new int[32];
		int i = 0;
		for (i = 0; i < 32; i++) {
			a[i] = n % 2;
			n /= 2;
			if (n == 0)
				break;
		}
		for (; i >= 0; i--) {
			System.out.print(a[i]);
		}
		System.out.println();
	}

	private static int toDec(String s) {
		// TODO Auto-generated method stub
		int sum = 0;
		char a[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			sum = sum * 2 + (a[i] - '0');
		}
		return sum;
	}
}
