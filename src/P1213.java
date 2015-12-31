import java.util.Scanner;

public class P1213 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int m = cin.nextInt();
		int a[] = new int[n];
		for (int i=0; i<n; i++)
			a[i] = cin.nextInt();
		while (m-- > 0)
		{
			int p = cin.nextInt();
			int q = cin.nextInt();
			int min = a[p-1], max = a[p-1];
			for (int i=p-1; i<q; i++){
				if ( max < a[i]) max = a[i];
				if ( min > a[i]) min = a[i];
			}
			System.out.println(max - min);
		}
		cin.close();
	}
}
