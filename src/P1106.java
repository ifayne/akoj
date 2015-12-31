import java.util.Scanner;

public class P1106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();
		int c = cin.nextInt();
		if ( a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a )
			System.out.println("yes");
		else{
			System.out.println(f(a, b, c));
		}
		cin.close();
	}

	private static String f(int a, int b, int c) {
		// TODO Auto-generated method stub
		String yes = "no", no = "not a triangle";
		if ( a + b > c && Math.abs(a - b) < c )
			return yes;
		else return no;
	}

}
