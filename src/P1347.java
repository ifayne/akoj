import java.math.BigInteger;
import java.util.Scanner;

public class P1347 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()){
			int n = cin.nextInt();
			BigInteger a = new BigInteger("1");
			for (int i=1; i<=n; i++){
				a = a.multiply(BigInteger.valueOf(i));
			}
			System.out.println(a);
		}
		cin.close();
	}
}
