import java.util.Scanner;

public class P1117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while ( cin.hasNext() ){
			int n = cin.nextInt();
			int a[] = new int[n];
			for ( int i=0; i<n; i++ ){
				a[i] = cin.nextInt();
			}
			int m = cin.nextInt();
			int count = 0;
			for ( int i=0; i<n; i++ ){
				if ( a[i] < m ) count++;
			}
			System.out.println(count);
		}
		cin.close();
	}

}
