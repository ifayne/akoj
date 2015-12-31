import java.text.DecimalFormat;
import java.util.Scanner;

public class P1131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n =cin.nextInt();
		int count = 0, a = 2, b = 1, t = 0;
		double sum = 0;
		while ( count++ < n )
		{
			sum += ((double)(a)/(double)(b));
			t = a;
			a = a + b;
			b = t;
		}
		DecimalFormat df =new DecimalFormat("0.000");
		System.out.println(df.format(sum));

		cin.close();
	}

}
