import java.util.Scanner;

public class P1041 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		while ( n != 0 )
		{
			for ( int i=0; i< n/100; i++ ){
				System.out.println("100");
			}
			n %= 100;
			for ( int i=0; i< n/50; i++ ){
				System.out.println("50");
			}
			n %= 50;
			for ( int i=0; i< n/20; i++ ){
				System.out.println("20");
			}
			n %= 20;
			for ( int i=0; i< n/10; i++ ){
				System.out.println("10");
			}
			n %= 10;
			for ( int i=0; i< n/5; i++ ){
				System.out.println("5");
			}
			n %= 5;
			for ( int i=0; i< n/2; i++ ){
				System.out.println("2");
			}
			n %= 2;
			for ( int i=0; i< n; i++ ){
				System.out.println("1");
			}
		}
		cin.close();
	}
}
