import java.util.Scanner;

public class P1122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		for ( int i=192; i<=333; i++ ){
			for ( int j=384; j<=666; j++ ){
				for ( int k=576; k<=999; k++ ){
					if ( i * 2 == j && 3 * i == k ){
						int a[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
						a[i%10] = a[i/10%10] = a[i/100] = 1;
						a[j%10] = a[j/10%10] = a[j/100] = 1;
						a[k%10] = a[k/10%10] = a[k/100] = 1;
						int s = 0;
						for ( int m=1; m<10; m++ ){
							s += a[m];
						}
						if ( s == 9 ){
							System.out.println(i+" "+j+" "+k);
						}
					}
				}
			}
		}
		cin.close();
	}

}
