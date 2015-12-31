import java.util.Scanner;

public class P1079 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			char a[] = cin.next().toCharArray();
			System.out.println(f(a));
		}
		cin.close();
	}

	private static int f(char[] a) {
		int c = a.length, j= 0;
		for (int i=1; i<a.length; i++) {
			if (a.length % i == 0) {
				for (j=i; j<a.length; j++) {
					if (a[j-i] != a[j]) {
						break;
					}
				}
			}
			if (j == a.length){
				c = i;
				break;
			}
		}
		return c;
	}
}
