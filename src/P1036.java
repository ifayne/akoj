import java.util.Scanner;

public class P1036 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0)
		{
			int n = cin.nextInt();
			String s = Integer.toBinaryString(n);
			char a[] = s.toCharArray();
			char b[] = new char[32];
			for ( int i=0; i<32; i++ ){
				b[i] = '0';
			}
			int count = 0;
			for ( int i=32-s.length(); i<32; i++ ){
				b[i] = a[count++];
			}
			for ( int i=0; i<32; i++ ){
				System.out.print(b[i]);
			}System.out.println();
		}
		cin.close();
	}
}
