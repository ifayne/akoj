import java.util.Scanner;

public class P1315 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()){
			int m = cin.nextInt();
			int n = cin.nextInt();
			int a[][] =  new int[m][n];
			if (m == 0 && n == 0) break;
			int sum = 0, min = 0, max = 0;
			
			for (int i=0; i<m; i++ ){
				for (int j=0; j<n; j++ ){
					a[i][j] = cin.nextInt();
				}
			}
			for (int i=0; i<m; i++){
				sum += a[i][0];
			}
			max = min = sum;
			for (int i=0; i<m; i++){
				sum = 0;
				for (int j=0; j<n; j++){
					sum += a[i][j];
				}
				if (sum > max)
					max = sum;
				if (sum < min)
					min = sum;
			}
			for (int j=0; j<n; j++){
				sum = 0;
				for (int i=0; i<m; i++){
					sum += a[i][j];
				}
				if (sum > max)
					max = sum;
				if (sum < min)
					min = sum;
			}
			System.out.println(max-min);
		}
		cin.close();
	}

}
