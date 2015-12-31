import java.util.Arrays;
import java.util.Scanner;

public class P1258 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()){
			int n = cin.nextInt();
			int a[] = new int[n];
			for (int i=0; i<n; i++){
				a[i] = cin.nextInt();
			}
			Arrays.sort(a);
			System.out.println(a[n-1]-a[0]);
		}
		cin.close();
	}
}
