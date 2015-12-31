import java.util.Scanner;
//wait
public class P1116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		for ( int i=0; i<n; i++ ){
			for ( int k=0; k<i; k++ ){
				System.out.print(" ");
			}
			for ( int j=0; j<(n-i)*2-1; j++ ){
				System.out.print("#");
			}
			System.out.println();
		}
		cin.close();
	}

}
