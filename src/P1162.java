import java.util.Scanner;

public class P1162 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String s = cin.nextLine();
			char a[] = s.toCharArray();
			int b[] = new int[200], count = 0, sum = 0;
			b[0] = a[0] - '0';
			for (int i = 1; i < s.length() - 1; i += 2) {
				int x = a[i + 1] - '0';
				switch (a[i]) {
				case '*':
					b[count] *= x;
					break;// 遇到乘除就当成一个数处理
				case '/':
					b[count] /= x;
					break;
				case '+':
					b[++count] = x;
					break;
				case '-':
					b[++count] = -x;
					break;
				}
			}
			for (; count >= 0; count--) {
				sum += b[count];
			}
			System.out.println(sum);
		}
		cin.close();
	}
}
