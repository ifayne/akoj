import java.util.Arrays;
import java.util.Scanner;

public class P1144 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		double s[] = new double[t];
		for (int i = 0; i < t; i++) {
			double a = cin.nextDouble();
			double b = cin.nextDouble();
			double k = b / a;
			s[i] = k;
		}
		int max = 1, cnt = 1;
		Arrays.sort(s);
		for (int i = 1; i < t; i++) {
			if (s[i] == s[i - 1]) {
				cnt++;
			} else
				cnt = 1;
			if (cnt > max) {
				max = cnt;
			}
		}
		System.out.println(max);
		cin.close();
	}
}
