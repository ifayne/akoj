import java.util.Scanner;

public class P1192 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext())
		{
			long fat = cin.nextLong();
			long thin = cin.nextLong();
			if (f(fat) > f(thin))
				System.out.println("fat");
			else if (f(fat) == f(thin))
				System.out.println("fat and thin");
			else {
				System.out.println("thin");
			}
		}
		cin.close();
	}

	private static long f(long n) {
		long count = 0, max = 0;
		while (n != 0){
			if (n % 2 == 1){
				count++;
			}
			else {
				count = 0;
			}
			if (max < count)
				max = count;
			n /= 2;
		}
		return max;
	}
}
