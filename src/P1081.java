import java.util.Scanner;

public class P1081 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String s1 = cin.next();
			String s2 = cin.next();
			char a1[] = s1.toCharArray();
			char a2[] = s2.toCharArray();
			int n = cin.nextInt();
			if ((a1[s1.length() - 1] - '0' + a2[s2.length() - 1] - '0') % 10 == n) {
				System.out.println("YES");
			} else
				System.out.println("NO");
		}
		cin.close();
	}
}
