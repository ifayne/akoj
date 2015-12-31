import java.util.Scanner;

public class P1343 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()){
			int n = cin.nextInt();
			for (int i=1; i<=n; i++ ){
				for ( int j=1; j<=i; j++){
					System.out.print(String.format("%d*%d=%d ", j, i, i*j));
				}
				System.out.println();
			}
		}
		cin.close();
	}
}
