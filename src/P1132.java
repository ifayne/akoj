import java.text.DecimalFormat;
import java.util.Scanner;

public class P1132 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		double a = cin.nextDouble();
		double b = cin.nextDouble();
		double c = cin.nextDouble();
		if (a + b > c && Math.abs(a - b) < c) {
			double s = (a + b + c) / 2;
			double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
			DecimalFormat df = new DecimalFormat("0.00");
			System.out.println(df.format(area));
		} else
			System.out.println("Input error!");
		cin.close();
	}

}
