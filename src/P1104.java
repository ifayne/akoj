import java.text.DecimalFormat;
import java.util.Scanner;

public class P1104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		DecimalFormat df = new DecimalFormat(".00");
		System.out.println(df.format(f(n)));
		cin.close();
	}

	private static double f(int n) {
		// TODO Auto-generated method stub
		if ( n*95 >= 300 ){
			return n*95.0*0.85;
		}
		else return n*95.0;
	}

}
