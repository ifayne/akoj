import java.math.BigInteger;
import java.util.Scanner;

public class P1053 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			BigInteger f = new BigInteger("1");
			for (int i=1; i<=n; i++){
				f = f.multiply(BigInteger.valueOf(i));
			}
			System.out.println(f);
		}
		cin.close();
	}
}
