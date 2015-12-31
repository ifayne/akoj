import java.text.DecimalFormat;
import java.util.Scanner;

public class P1119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			double PI = 0;
			int n = cin.nextInt();
			int count = 1;
			int k = -1;
			while (count <= n) {
				k *= -1;
				PI += (1.0 / ((double) count) * k);
				count += 2;
			}
			DecimalFormat df = new DecimalFormat(".000000");
			System.out.println(df.format(PI * 4));
		}
		cin.close();
	}

}
