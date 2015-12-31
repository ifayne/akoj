import java.util.Scanner;

public class P1268 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while ( cin.hasNext() )
		{
			int n = cin.nextInt();
			int m = 0;
			if ( n % 4 != 0 )
				m = 1;
			System.out.println(n/4 + m);
		}
		cin.close();
	}

}
