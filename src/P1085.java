import java.util.Scanner;

public class P1085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			long n = cin.nextLong();
			if ( f(n) % 2 == 0 ){
				System.out.println("even");
			}else System.out.println("odd");
		}
		cin.close();
	}

	private static long f(long n) {
		// TODO Auto-generated method stub
		long count = 0;
		while (n != 0){
			if ( n % 2 == 1 )
				count++;
			n /= 2;
		}
		return count;
	}

}
