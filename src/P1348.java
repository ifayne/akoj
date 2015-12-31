import java.util.Scanner;

public class P1348 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()){
			int a = cin.nextInt();
			int b = cin.nextInt();
			if ( a % b == 0 )
				System.out.println(String.format("%d", a/b));
			else
				System.out.println(String.format("%.2f", (double)a/(double)b));
		}
		cin.close();
	}
}
