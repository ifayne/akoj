import java.util.Scanner;

public class P1349 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String a[] = { "ling", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve", "thirteen", "fourteen", "fifteen", "sisteen", "seventeen", "eighteen", "nineteen", "twenty" };
		//int b[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		while (cin.hasNext()) {
			String s1 = cin.next();
			String s2 = cin.next();
			int a1 = 0, a2 = 0;
			for (int i = 0; i < 21; i++) {
				if (s1.equals(a[i]))
					a1 = i;
			}
			for (int i = 0; i < 21; i++) {
				if (s2.equals(a[i]))
					a2 = i;
			}
			System.out.println(a[a1 + a2]);

		}
		cin.close();
	}
}
