import java.text.DecimalFormat;
import java.util.Scanner;

public class P1120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00000");
		while (cin.hasNext()) {
			long n = cin.nextLong();
			long m = cin.nextLong();
			double sum = 0;
			for (long i = n; i <= m; i++) {
				sum += (1.0 / Math.pow((double) i, 2));
			}
			System.out.println(df.format(sum));
		}
		cin.close();
	}

}
