import java.text.DecimalFormat;
import java.util.Scanner;

public class P1154 {

	@SuppressWarnings("unused")
	private static String s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		double sum = 0;
		while ( cin.hasNext() )
		{
			s = cin.next();
			double n = cin.nextDouble();
			double m = cin.nextDouble();
			sum += (n*m);
		}
		DecimalFormat df = new DecimalFormat("0.0");
		System.out.println(df.format(sum));
		cin.close();
	}

}
