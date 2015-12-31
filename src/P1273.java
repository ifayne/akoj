import java.util.Scanner;

public class P1273 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int count = 0;
			for (int i=0; ;i++){
				if (f(i) == f(n) && i != n)
				{
					System.out.print(i+" ");
					count++;
				}
				if (count == 5 || i > 10000)
					break;
			}
			System.out.println();
		}
		cin.close();
	}

	private static int f(int n) {
		return n < 1 ? 0 : f(n/2) + n % 2;
	}
}
