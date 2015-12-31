import java.util.Scanner;

public class P1114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();
		for ( int i=a; i<=b; i++ ){
			if ( i==153 || i == 370 || i == 371 || i == 407) System.out.println(i);
		}
		cin.close();
	}

}
