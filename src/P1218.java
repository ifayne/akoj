import java.math.BigInteger;
import java.util.Scanner;

public class P1218 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0) {
			BigInteger sum = new BigInteger("0");
			while (cin.hasNext()) {
				String s = cin.next();
				BigInteger a = new BigInteger(s);
				if (s.equals("0"))
					break;
				sum = sum.add(a);
			}
			System.out.println(sum);
		}
		cin.close();
	}
}
