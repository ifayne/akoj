import java.util.Scanner;

public class P1028 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String string[] = cin.nextLine().trim().split("[\\s\\p{Punct}]+");
		for (int i = 0; i < string.length; i++) {
			System.out.println(string[i]);
		}
		cin.close();
	}
}
