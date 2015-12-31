import java.util.Scanner;

public class P1017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while ( cin.hasNext()){
			int n = cin.nextInt();
			if ( n < 0 ) n = -n;
			if ( f(n) ){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
		cin.close();
	}

	private static boolean f(int n) {
		// TODO Auto-generated method stub
		if ( n == 0 || n == 1 ) return true;
		for ( int i=2; i<Math.sqrt(n); i++ ){
			if ( i * i * i == n ) return true;
		}
		return false;
	}

}
