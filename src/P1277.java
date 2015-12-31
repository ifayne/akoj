import java.util.Arrays;
import java.util.Scanner;

public class P1277 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		double a[] = new double[t];
		for (int i=0; i<t; i++){
			a[i] = cin.nextDouble();
		}
		Arrays.sort(a);
		double result = a[a.length-1];
		for (int i=a.length-2; i>=0; i--){
			result = 2 * Math.sqrt(result*a[i]);
		}
		System.out.printf("%.3f\n", result);
		cin.close();
	}
}
