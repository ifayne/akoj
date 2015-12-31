import java.util.Scanner;

public class P1090 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext())
		{
			String s = cin.nextLine();
			if (s.equals("END")) break;
			char a[] = s.toCharArray();
			for ( int i=0; i<s.length(); i++ ){
				if ( a[i] == 'A' || a[i] == 'W' || a[i] == 'F' ){
					System.out.print("I");
				}
				else if ( a[i] == 'C')
					System.out.print("L");
				else if (a[i] == 'M')
					System.out.print("o");
				else if ( a[i] == 'S' )
					System.out.print("v");
				else if ( a[i] == 'D' || a[i] == 'P' || a[i] == 'G' || a[i] == 'B')
					System.out.print("e");
				else if (a[i] == 'L')
					System.out.print("Y");
				else if ( a[i] == 'X' )
					System.out.print("u");
				else System.out.print(a[i]);
			}
			System.out.println();
		}
		cin.close();
	}
}
