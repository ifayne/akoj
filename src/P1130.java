import java.util.Scanner;

public class P1130 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int a[][] = new int[4][3];
		for ( int i=0; i<4; i++ ){
			for ( int j=0; j<3; j++ ){
				a[i][j] = cin.nextInt();
			}
		}
		int max = a[0][0], h = 0, l = 0;
		for ( int i=0; i<4; i++ ){
			for ( int j=0; j<3; j++ ){
				if ( max < a[i][j] ){
					max = a[i][j];
					h = i;
					l = j;
				}
			}
		}
		System.out.println(max+" "+h+" "+l);
		cin.close();
	}

}
