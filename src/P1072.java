import java.util.Scanner;

public class P1072 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while ( cin.hasNext() ){
			int n = cin.nextInt();
			if ( n % 2 == 0  )
					System.out.println(n/2*(n+1));
			else System.out.println((n+1)/2*n);
		}
		cin.close();
	}
}
