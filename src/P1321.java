import java.util.Scanner;

public class P1321 {
	public static void main(String[] args) {
		final int a[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		final int b[] = { 0, 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334 };
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String string[] = cin.nextLine().trim().split("\\W+");
			int year = Integer.valueOf(string[0]);
			int month = Integer.valueOf(string[1]);
			int day = Integer.valueOf(string[2]);
			int t = Integer.valueOf(string[3]);
			int tDay = 10000 % t == 0 ? 10000 / t : 10000 / t + 1;
			int today = b[month] + day;
			int end = today + tDay;
			int tYear = end / 365;
			end %= 365;
			int tMonth = 0;
			for (int i = 1; i <= 12; i++) {
				for (int j = 1; j <= a[i]; j++) {
					if (j + b[i] == end) {
						tMonth = i;
						tDay = j;
						break;
					}
				}
			}
			System.out.println(tYear + year + "/" + tMonth + "/" + (tDay - 1));
		}
		cin.close();
	}
}
