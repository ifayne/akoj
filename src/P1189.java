import java.util.Scanner;

public class P1189 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String s = cin.next();
			String ch = cin.next();
			char a[] = ch.toCharArray();
			char src[] = s.toCharArray();
			for (int i = 0; i < s.length(); i++) {
				if (src[i] != a[0])
					System.out.print(src[i]);
			}
			System.out.println();
		}
		cin.close();
	}
}
