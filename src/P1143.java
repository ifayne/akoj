import java.util.Scanner;

public class P1143 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0) {
			int x = cin.nextInt();
			System.out.println(x * x - x + 1);
		}
		cin.close();
	}

}
