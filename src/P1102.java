import java.text.DecimalFormat;
import java.util.Scanner;

public class P1102 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		double x1 = cin.nextDouble();
		double y1 = cin.nextDouble();
		double x2 = cin.nextDouble();
		double y2 = cin.nextDouble();
		double length = Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
		DecimalFormat df = new DecimalFormat(".000");
		System.out.println(df.format(length));
		cin.close();
	}
}
