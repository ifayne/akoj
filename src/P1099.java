import java.text.DecimalFormat;
import java.util.Scanner;

public class P1099 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		double f = cin.nextDouble();
		double c = 5*(f-32)/9.000;
		DecimalFormat df = new DecimalFormat("0.000");
		System.out.println(df.format(c));
		cin.close();
	}

}
