import java.util.Scanner;

public class P1288 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext())
		{
			int n = cin.nextInt();
			int m = cin.nextInt();
			for (int i=0; i<n; i++)
				cin.next();
			int a[] = new int[m];
			for (int i=0; i<m; i++)
				a[i] = cin.nextInt();
			int tu = cin.nextInt();
			int i = 0;
			for (; i<m; i++){
				if (tu == a[i]){
					System.out.println("YES");
					break;
				}
			}
			if ( i == m )
				System.out.println("NO");
		}
		cin.close();
	}
}
