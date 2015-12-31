import java.text.DecimalFormat;
import java.util.Scanner;

public class P1034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		double u = cin.nextDouble();
		double d = cin.nextDouble();
		double h = cin.nextDouble();
		double area = (u+d)*h/2;
		double circle = u + d + 2 * Math.sqrt(Math.pow((d-u)/2, 2) + Math.pow(h, 2));
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(df.format(area));
		System.out.println(df.format(circle));
		cin.close();
	}

}
