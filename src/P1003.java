import java.math.BigInteger;
import java.util.Scanner;

public class P1003 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext())
		{
			int n = cin.nextInt();
			BigInteger k = new BigInteger("1");
			for ( int i=2; i<=n; i++ ){
				k = k.multiply(new BigInteger(i+""));
			}
			System.out.println(k);
		}
		cin.close();
	}
}
