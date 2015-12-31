import java.util.Scanner;

public class P1284 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while ( cin.hasNext())
		{
			int n = cin.nextInt();
			int a[] = new int[n];
			for (int i=0; i<n; i++ ){
				a[i] = cin.nextInt();
			}
			int max = a[0], max_ = 0;
			for ( int i=1; i<n; i++ ){
				if ( max < a[i] ){
					max = a[i];
					max_ = i;
				}
			}
			System.out.println(max);
			System.out.print(max_);
			for ( int i = max_+1; i<n; i++ ){
				if ( max == a[i])
				System.out.print(" "+i);
			}System.out.println();
		}
		cin.close();
	}
}
