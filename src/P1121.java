import java.util.Scanner;

public class P1121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while ( cin.hasNext() && cin.hasNext() && cin.hasNext() ){
			int a = cin.nextInt();
			int b = cin.nextInt();
			int c = cin.nextInt();
			System.out.print(a/b);
			if ( c != 0 ) System.out.print(".");
			int f = 0, s = 0;
			while ( c-- > -1 )
			{
				a = a % b * 10;
				if ( c >= 1 )
					System.out.print(a/b);
				if ( c == 0 ) f = a / b;
				if ( c == -1) s = a / b;
				
			}
			if ( s >= 5 ) f++;
			System.out.println(f);
		}
		cin.close();
	}

}
