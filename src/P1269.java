import java.util.Scanner;

public class P1269 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext())
		{
			int n = cin.nextInt();
			System.out.println(f(n));
		}
		cin.close();
	}

	private static int f(int n) {
		int count = 1, s = 1;
		while (s % n != 0){
			count++;
			s = (s * 10 + 1) % n;
		}
		return count;
	}
}
