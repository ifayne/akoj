import java.util.Arrays;
import java.util.Scanner;

public class P1278 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int []a = new int[n];
		for (int i=0; i<n; i++ ){
			a[i] = cin.nextInt();
		}
		Arrays.sort(a);
		for (int i=0; i<n; i++ )
			System.out.print(a[i]+" ");
		cin.close();
	}
}
