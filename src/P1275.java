
import java.util.Scanner;

public class P1275 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while ( cin.hasNext() && cin.hasNext() )
		{
			long x = cin.nextLong();
			long n = cin.nextLong();
			System.out.println(pow(x, n));
		}
		cin.close();
	}

	private static long pow(long x, long n) {
		// TODO Auto-generated method stub
		if (x == 0) 
			return 0;
		if ( x == 1 || n == 0)
			return 1;
		if ( n % 2 == 0)
			return pow(x*x, n/2);
		else
			return pow(x*x, n/2)*x;
	}
}