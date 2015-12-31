import java.util.Scanner;

public class P1027 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int sum = 0;
		int t = n;
		while ( t != 0 ){
			sum += (t % 10);
			t /= 10;
		}
		if ( n % sum == 0 ){
			System.out.println("Lucky Word");
		}else{
			System.out.println("No Answer");
		}
		cin.close();
	}
}
