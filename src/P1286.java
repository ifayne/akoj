import java.util.Scanner;

public class P1286 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext())
		{
			String s = cin.next();
			char a[] = s.toCharArray();
			for ( int i=0; i<s.length(); i++ ){
				if ( a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u' )
					a[i] -= 32;
				System.out.print(a[i]);
			}
			System.out.println();
		}
		cin.close();
	}
}
