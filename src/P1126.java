import java.util.Scanner;

public class P1126 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();
		int l = (a % 10 + b % 10)%10;
		int f = (a / 10 + b / 10)%10;
		System.out.println(l + f*10);
		cin.close();
	}

}
