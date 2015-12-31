import java.util.Scanner;

public class P1063 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()){
			int n = cin.nextInt();
			if ( n == 0 ) break;
			int sum = 0;
			for (int i=0; i<n; i++ ){
				int temp = cin.nextInt();
				sum += f(temp);
			}
			System.out.println(sum);
		}
		cin.close();
	}

	private static int f(int n) {
		// TODO Auto-generated method stub
		int count = 0;
		count += (n / 100);
		n %= 100;
		count += (n / 50);
		n %= 50;
		count += (n / 10);
		n %= 10;
		count += (n / 5);
		n %= 5;
		count += (n / 2);
		n %= 2;
		count += n;
		return count;
	}

}
