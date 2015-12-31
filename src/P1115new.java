import java.util.Scanner;

public class P1115new {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while ( cin.hasNext() )
		{
			int a = cin.nextInt();
			int b = cin.nextInt();
			int c = cin.nextInt();
			int p = 0;
			for ( int i=10; i<=100; i++ ){
				if ( i % 3 == a && i % 5 == b && i % 7 == c ){
					System.out.println(i);
					p = 1;
					break;
				}
			}
			if ( p == 0 ) System.out.println("No answer");
		}
		cin.close();
	}
}
