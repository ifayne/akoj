import java.util.Scanner;

public class P1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		long n = cin.nextInt();
		int count = 0;
		while ( n != 1 )
		{
			if ( n % 2 != 0) n = 3*n+1;
			else n /= 2;
			count++;
		}
		System.out.println(count);
		cin.close();
	}

}
