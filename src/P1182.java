import java.util.Scanner;

public class P1182 {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		while ( cin.hasNext() && cin.hasNext() )
		{
			int n = cin.nextInt();
			int k = cin.nextInt();
			if ( n == 0 && k == 0 ) break;
			System.out.println(f(n, k));
		}
		cin.close();
	}

	private static String f(int n, int k) {

		int i = 1, j = n-1, p = 0;
		String s = "NO";
		while ( i <= j )
		{
			if ( i * j == k ) 
			{
				p = 1;
				break;
		    }
			i++; j--;
		}
		if ( p == 1 ) s = "YES";
		return s;
	}

}
