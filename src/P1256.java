import java.util.Scanner;

public class P1256 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String a = cin.next();
			String b = cin.next();
			System.out.println(Integer.toHexString(Integer.parseInt(a, 16) + Integer.parseInt(b, 16)).toUpperCase());
		}
		cin.close();
	}
}
