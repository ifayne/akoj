import java.util.Scanner;
import java.util.TreeSet;

public class P1283 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0) {
			int n = cin.nextInt();
			TreeSet<Integer> v = new TreeSet<>();
			for (int i = 0; i < n; i++)
				v.add(cin.nextInt());
			System.out.println(v.size());
			Object[] a = v.toArray();
			for (int i = 0; i < v.size() - 1; i++) {
				System.out.print((int) a[i] + " ");
			}
			System.out.println((int) a[v.size() - 1]);
		}
		cin.close();
	}
}
