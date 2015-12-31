import java.util.Arrays;
import java.util.Scanner;

public class P1128 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int a[] = new int[10];
		for ( int i=0; i<10; i++ ){
			a[i] = cin.nextInt();
		}
		Arrays.sort(a);
		System.out.print(a[0]);
		for ( int i=1; i<10; i++ ){
			System.out.print(" "+a[i]);
		}
		System.out.println();
		cin.close();
	}

}
