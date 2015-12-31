import java.util.Scanner;

public class P1313 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			long s = cin.nextLong();
			long busy = s / 1000;
			s %= 1000;
			long m = s / 500;

			long l = 67 - busy - m;
			System.out.println(busy + " " + m + " " + l);
		}
		cin.close();
	}
}
