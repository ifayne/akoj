import java.util.Scanner;

public class P1035 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while ( cin.hasNext() ){
			String s = cin.next();
			char a[] = s.toCharArray();
			for ( int i=0; i<s.length(); i++ ){
				if ( a[i] >= 'a' && a[i] <= 'z' || a[i] >= 'A' && a[i] <= 'Z')
					System.out.print(a[i]);
			}
			System.out.println();
		}
		cin.close();
	}

}
