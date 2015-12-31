import java.util.Arrays;
import java.util.Scanner;

public class P1169 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0 )
		{
			int n = cin.nextInt();
			String s[] = new String[n];
			for ( int i=0; i<n; i++ ){
				s[i] = cin.next();
			}
			Arrays.sort(s);
			System.out.println(s[0]);
		}
		cin.close();
	}
}
