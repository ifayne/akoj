import java.util.Scanner;

public class P1303 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while ( cin.hasNext() && cin.hasNext() )
		{
			int a = cin.nextInt();
			int b = cin.nextInt();
			if ( f(a) > f(b) ){
				System.out.println(">");
			}
			else if ( f(a) == f(b) ){
				System.out.println("=");
			}
			else {
				System.out.println("<");
			}
		}
		cin.close();
	}

	private static int f(int n) {
		// TODO Auto-generated method stub
		int count = 0;
		while ( n > 1 ){
			if ( n % 2 == 0 ){
				count++;
				n /= 2;
			}
			else break;
		}
		return count;
	} 
}
