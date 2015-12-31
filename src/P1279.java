import java.util.Scanner;

public class P1279 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int cnt = 0;
		while (cin.hasNext())
		{
			int n = cin.nextInt();
			int a[] = new int[n];
			int sum = 0;
			
			for (int i=0; i<n; i++){
				a[i] = cin.nextInt();
				sum += a[i];
			}
			if (sum % n != 0)
				System.out.println("No solution");
			else{
				cnt++;
				System.out.println("Case #"+cnt);
				int avr = sum / n;
				int count = 0;
				for ( int i=0; i<n; i++ ){
					if (a[i] > avr){
						count += (a[i]-avr);
					}
				}
				System.out.println(count);
			}
		}
		cin.close();
	}
}
