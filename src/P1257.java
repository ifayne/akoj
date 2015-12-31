import java.util.Scanner;

public class P1257 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			double k = 1;
			int m = cin.nextInt();
			for (int i=1; i<=m; i++){
				k += Math.log10(i*1.0);
			}
			System.out.println((long)k);
		}
		cin.close();
				
	}
}
