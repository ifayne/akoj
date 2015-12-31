import java.text.DecimalFormat;
import java.util.Scanner;

public class P1174 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		int t = cin.nextInt();
		while (t-- > 0) {
			double n = cin.nextDouble();
			double r = 2 * Math.sqrt((Math.pow(n, 2) - Math.pow(n / 2, 2))) / 3;
			double PI = 3.1415926;
			System.out.println(df.format(PI * r * r));
		}
		cin.close();
	}

}
