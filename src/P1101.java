import java.text.DecimalFormat;
import java.util.Scanner;

public class P1101 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		double n = cin.nextDouble();
		double result1 = Math.sin(n/180*Math.PI);
		double result2 = Math.cos(n/180*Math.PI);
		System.out.println(df.format(result1)+" "+df.format(result2));
		cin.close();
	}
}
