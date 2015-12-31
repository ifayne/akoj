import java.util.Scanner;

public class P1052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while ( t-- > 0 )
		{
			int count = 0;
			String s = cin.next();
			char a[] = s.toCharArray();
			for ( int i=0; i<s.length(); i++ ){
				if ( a[i] >= '0' && a[i] <= '9')
					count++;
			}
			System.out.println(count);
		}
		cin.close();
	}

}
