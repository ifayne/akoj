import java.util.Arrays;
import java.util.Scanner;

public class P1208 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext())
		{
			int m = cin.nextInt();
			int n = cin.nextInt();
			int a[] = new int[m];
			int b[] = new int[n];
			for (int i=0; i<m; i++ ){
				a[i] = cin.nextInt();
			}
			for (int i=0; i<n; i++){
				b[i] = cin.nextInt();
			}
			Arrays.sort(a);
			Arrays.sort(b);
			int max = b[n-1]-a[0];
			if (a[m-1]-a[0] > max ) max = b[m-1] - a[0];
			System.out.println(max);
		}
		cin.close();
	}
}
