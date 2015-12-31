import java.util.Scanner;

public class P1298 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while ( cin.hasNext() && cin.hasNext() ){
			int a = cin.nextInt();
			int n = cin.nextInt();
			long sum = 0, num = 0;
			for ( int i=1; i<=n; i++ ){
				for ( int j=0; j<i; j++ ){
					num = num * 10 + a;
				}
				sum += num;
				num = 0;
			}
			System.out.println(sum);
		}
		cin.close();
	}

}
