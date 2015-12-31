import java.util.Scanner;

public class P1190 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while ( cin.hasNext() )
		{
			int n = cin.nextInt();
			int a[] = new int[n+1];
			for ( int i=1; i<=n; i++ ){
				a[i] = cin.nextInt();
			}
			a[0] = cin.nextInt();
			int i = n;
			for (  i=n; i>=0; i-- ){
				if ( a[0] == a[i] ) break;
			}
			if ( i != 0 ) System.out.println(i-1);
			else System.out.println("-1");
		}
		cin.close();
	}

}
