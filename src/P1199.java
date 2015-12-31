
import java.util.Arrays;
import java.util.Scanner;

public class P1199 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext() && cin.hasNext()) {
			int n = cin.nextInt();
			int k = cin.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = cin.nextInt();
			}
			Arrays.sort(a);
			System.out.println(a[n - k]);
		}
		cin.close();
	}

}
