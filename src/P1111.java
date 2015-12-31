import java.util.Scanner;

public class P1111 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		long i = 1, sum = 0, init = 1;
		long n = cin.nextLong();
		while ( i++ <= n ){
			sum = (sum + init)%1000000;
			init = (init *i) % 1000000;
		}
		System.out.println(sum);
		
		cin.close();
	}
}
