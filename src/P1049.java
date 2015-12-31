import java.util.Scanner;

public class P1049 {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		int n = cin.nextInt();
		int p = cin.nextInt();
		int a[][] = new int[n][n];
		if (p == 1)
			for (int j=0; j<n; j++){
				for (int i=n-1; i>=0; i--){
					a[i][j] = cin.nextInt();
				}
			}
		else if (p == 2)
			for (int i=n-1; i>=0; i--){
				for (int j=n-1; j>=0; j--){
					a[i][j] = cin.nextInt();
				}
			}
		else if (p == 3)
			for (int j=n-1; j>=0; j--){
				for (int i=0; i<n; i++){
					a[i][j] = cin.nextInt();
				}
			}
		for (int i=0; i<n; i++){
			for (int j=0; j<n; j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		cin.close();
	}
}
