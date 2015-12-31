import java.util.Scanner;

public class P1186 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while ( cin.hasNext() && cin.hasNext() ){
			int m = cin.nextInt();
			int n = cin.nextInt();
			if ( m == 0 && n == 0) break;
			int plus = 0, count = 0;
			while ( m != 0 && n != 0 ){
				if ( m % 10 + n % 10 + plus >= 10 ){
					plus = 1;
					count++;
				}else {
					plus = 0;
				}
				m /= 10; n /= 10;
			}
			System.out.println(count);
		}
		cin.close();
	}
}
