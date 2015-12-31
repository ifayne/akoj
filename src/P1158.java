import java.util.Scanner;

public class P1158 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext())
		{
			int a = cin.nextInt();
			int b = cin.nextInt();
			System.out.println(f(a, b)+" "+very(a, b));
		}
		cin.close();
	}

	private static int f(int a, int b) {
		// TODO Auto-generated method stub
		int count = 0;
		for ( int i=a; i<=b; i++ ){
			if (g(i)){
				count++;
			}
		}
		return count;
	}

	private static boolean g(int i) {
		// TODO Auto-generated method stub
		int count1 = 0, count2 = 0, count3 = 0;
		while ( i != 0 ){
			if ( i % 10 == 5 ) 
				count1 = 1;
			if ( i % 10 == 2 )
				count2 = 1;
			if ( i % 10 == 1 )
				count3 = 1;
			i /= 10;
		}
		if ( count1 + count2 + count3 == 3 ) return true;
		return false;
	}

	private static int very(int a, int b) {
		// TODO Auto-generated method stub
		int count = 0;
		for ( int i=a; i<=b; i++ ){
			if ( ve(i) ){
				count++;
			}
		}
		return count;
	}

	private static boolean ve(int i) {
		// TODO Auto-generated method stub
		while ( i != 0 ){
			if ( i % 10 == 1 && i / 10 % 10 == 2 && i / 100 % 10 == 5 )
				return true;
			i /= 10;
		}
		return false;
	}
}
