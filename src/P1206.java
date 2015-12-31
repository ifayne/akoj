import java.util.Scanner;

public class P1206 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while ( cin.hasNext() ){
			String s = cin.nextLine();
			char str[] = s.toCharArray();
			int a = 0, b = 0, c = 0, d = 0;
			for ( int i=0; i<s.length(); i++ ){
				if ( str[i] >= 'a' && str[i] <= 'z' || str[i] >= 'A' && str[i] <= 'Z' )
					a++;
				else if ( str[i] >= '0' && str[i] <= '9' )
					b++;
				else if ( str[i] == ' ' )
					c++;
				else 
					d++;
			}
			System.out.println(a+" "+b+" "+c+" "+d);
		}
		cin.close();
	}
}
