import java.text.DecimalFormat;
import java.util.Scanner;

public class P1098 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		double a = cin.nextDouble();
		double b = cin.nextDouble();
		double c = cin.nextDouble();
		double avr = (a + b + c) / 3.0;
		DecimalFormat df = new DecimalFormat(".000");
		System.out.println(df.format(avr));

		cin.close();
	}

}
