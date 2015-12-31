import java.util.Scanner;

public class P1266 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		double c = cin.nextDouble();
		System.out.println(String.format("%.3f", 9*c/5.0+32));
		cin.close();
	}
}
