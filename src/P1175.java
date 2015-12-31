import java.util.Scanner;

public class P1175 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();

		while (t-- > 0) {
			char a[] = new char[27];
			for (int i = 0; i < 26; i++) {
				a[i + 1] = (char) ('a' + i);
			}
			String string = cin.next();
			int count = 0;
			char aString[] = string.toCharArray();
			for (int i = 0; i < aString.length; i++) {
				if (aString[i] >= 'a' && aString[i] <= 'z')
					count++;
			}
			System.out.println(a[count%26]);
		}
		cin.close();
	}
}
