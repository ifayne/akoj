import java.util.Scanner;

public class P1341 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()){
			int t = cin.nextInt();
			int d = cin.nextInt();
			int n = cin.nextInt();
			int a[] = new int[n];
			int count = 0;
			for (int i=0; i<n; i++){
				a[i] = cin.nextInt();
				if (a[i] <= t + d)
					count++;
			}
			System.out.println(count);
		}
		cin.close();
	}
}
