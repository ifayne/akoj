import java.util.Scanner;

public class P1252 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext())
		{
			int n = cin.nextInt();
			int count = 0;
			for (int i=1; ; i++){
				if (isUgly(i))
					count++;
				if (count == n) {
					System.out.println(i);
					break;
				}
			}
		}
		cin.close();
	}

	private static boolean isUgly(int n) {
		while (n % 2 == 0) n /= 2;
		while (n % 3== 0)  n /= 3;
		while (n % 5 == 0) n /= 5;
		if (n == 1) 
			return true;
		return false;
	}
}
