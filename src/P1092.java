import java.util.Scanner;

public class P1092 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext())
		{
			int count = 0;
			int n = cin.nextInt();
			int m = cin.nextInt();
			int t = n;
			char ch[] = new char[202];
			while ( t != m )
			{
				if (t > m){
					t /= 2;
					ch[count++] = 'g';
				}
				else if (t < m){
					t *= 3;
					ch[count++] = 'f';
				}
			}
			System.out.println(count);
			for (int i=count-1; i>=0; i--){
				System.out.print(ch[i]);
			}
			System.out.println();
		}
		cin.close();
	}
}
