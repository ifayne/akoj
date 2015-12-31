import java.util.Arrays;
import java.util.Scanner;

public class P1197 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while ( cin.hasNext() && cin.hasNext() && cin.hasNext() && cin.hasNext() ){
			int a[] = new int[4];
			for ( int i=0; i<4; i++ ){
				a[i] = cin.nextInt();
			}
			Arrays.sort(a);
			if ( a[0] + a[1] + a[2] < 13 ){
				System.out.println("good luck");
			}else{
				System.out.println("oh no");
			}
		}
		cin.close();
	}

}
