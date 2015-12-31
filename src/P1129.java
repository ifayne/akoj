import java.util.Scanner;

public class P1129 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		String s = cin.next();
		char a[] = s.toCharArray();
		for ( int i=0; i<s.length(); i++ ){
			if ( a[i] != '@' ){
				System.out.print(a[i]);
			}
			else break;
		}
		System.out.println();
		cin.close();
	}

}
