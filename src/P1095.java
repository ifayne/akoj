import java.util.Scanner;

public class P1095 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		System.out.println(n % 10 * 100 + n / 10 % 10 * 10 + n / 100);
		cin.close();
	}

}
