import java.util.Scanner;

public class P1181 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while ( cin.hasNext()){
			int n = cin.nextInt();
			print(n);
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
}
