import java.util.Scanner;

public class P1297 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while ( cin.hasNext() && cin.hasNext() && cin.hasNext() )
		{
			int a = cin.nextInt();
			int p = cin.nextInt();
			int m = cin.nextInt();
			if ( a ==0 && p == 0 && m == 0 ) break;
			int result = a % m;
			for ( int i=1; i<p; i++ ){
				result = (result * a) % m;
			}
			System.out.println(result);
		}
		cin.close();
	}

}
