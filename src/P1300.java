
import java.util.Scanner;

public class P1300 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while ( t-- > 0 ){
			int a = cin.nextInt();
			int b = cin.nextInt();
			int c = cin.nextInt();
			if ( a + b ==  c){
				System.out.println("0");
			}
			else if ( a + b > c ){
				System.out.println(a+b-c);
			}
			else {
				System.out.println("Impossible");
			}
		}
		cin.close();
	}

}
