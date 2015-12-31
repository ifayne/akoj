import java.text.DecimalFormat;
import java.util.Scanner;

public class P1105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		double f = cin.nextDouble();
		DecimalFormat df = new DecimalFormat(".00");
		System.out.println(df.format(Math.abs(f)));
		cin.close();
	}

}
