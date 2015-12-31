import java.util.Scanner;

public class P1135 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		String s  = cin.next();
		char a[] = s.toCharArray();
		for ( int i=s.length()-1; i>=0; i-- ){
			System.out.print(a[i]);
		}
		System.out.println();
		cin.close();
	}
}
