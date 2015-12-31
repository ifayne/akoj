import java.util.Scanner;

public class P1195 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while ( cin.hasNext() )
		{
			int t = cin.nextInt();
			while ( t-- > 0 ){
				int a = cin.nextInt();
				int b = cin.nextInt();
				int c = cin.nextInt();
				if ( a > 2014 || a >= 2014 && b > 4 || a >= 2014 && b >= 4 && c > 20){
					System.out.println("after");
				}
				else if ( a == 2014 && b == 4 && c == 20){
					System.out.println("nice day");
				}else System.out.println("before");
			}
		}
		cin.close();
	}

}
