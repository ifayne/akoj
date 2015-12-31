import java.util.Scanner;

public class P1074 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			if (a == 0 && b == 0)
				break;
			System.out.println(pow(a, b) % 1000);
		}
		cin.close();
	}

	private static int pow(int a, int b) {
		// TODO Auto-generated method stub
		int k = 1;
		for (int i = 0; i < b; i++) {
			k = (k * a) % 1000;
		}
		return k;
	}
}
