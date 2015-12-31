import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class P1057 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()){
			int n = cin.nextInt();
			int a[] = new int[n];
			for ( int i=0; i<n; i++ ){
				a[i] = cin.nextInt();
			}
			Arrays.sort(a);
			double sum = 0;
			for ( int i=1; i<n-1; i++ ){
				sum += a[i];
			}
			DecimalFormat df = new DecimalFormat("0.00");
			System.out.println(df.format(sum/(n-2)));
		}
		cin.close();
	}

}
