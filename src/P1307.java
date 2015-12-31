import java.util.Scanner;

public class P1307 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int t = cin.nextInt();
			while (t-- > 0) {
				int n = cin.nextInt();
				int s = cin.nextInt();
				int a[] = new int[n];
				for (int i=0; i<n; i++)
					a[i] = cin.nextInt();
				int count = 0, min = a.length, sum = 0;
				for (int i=0; i<a.length; i++){
					sum = 0;
					count = 0;
					for (int j=i; j<a.length; j++){
						sum += a[j];
						count++;
						if (sum >= s)
							break;
					}
					if (sum >= s){
						if (count < min){
							min = count;
						}
					}
				}
				System.out.println(min);
			}
		}
		cin.close();
	}
}
