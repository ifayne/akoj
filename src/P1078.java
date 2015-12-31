import java.util.Scanner;

public class P1078 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0) {
			String s = cin.next();
			int sum = 0;
			char a[] = s.toCharArray();
			for (int i = 1; i < s.length(); i++) {
				sum = (a[i] - '0') + sum * 10;
			}
			System.out.println(sum);
		}
		cin.close();
	}
}
