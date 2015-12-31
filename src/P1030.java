import java.util.Arrays;
import java.util.Scanner;

public class P1030 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while ( t-- > 0 ){
			String s = cin.next();
			char a[] = s.toCharArray();
			Arrays.sort(a);
			System.out.print(a[0]);
			for ( int i=1; i<s.length(); i++ ){
				System.out.print(" "+a[i]);
			}
			System.out.println();
		}
		cin.close();
	}
}
