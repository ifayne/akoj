import java.text.DecimalFormat;
import java.util.Scanner;

public class P1094 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat(".000");
		double r = cin.nextDouble();
		double h = cin.nextDouble();
		double area = 2 * Math.PI * r * r + 2 * Math.PI * r * h;
		System.out.println("Area=" + df.format(area));

		cin.close();
	}
}
