import java.util.Scanner;

//???
public class P1008 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0) {
			String s = cin.next();
			char a[] = s.toCharArray();
			for (int i = 0; i < s.length(); i++) {
				if (a[i] >= 'a' && a[i] <= 'z') {
					a[i] -= 32;
				} else if (a[i] >= 'A' && a[i] <= 'Z') {
					a[i] += 32;
				}
			}
			for (int i = 0; i < s.length(); i++) {
				System.out.print(a[i]);
			}
			System.out.println();
		}
		cin.close();
	}
}
