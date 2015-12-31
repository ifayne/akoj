import java.util.Scanner;

public class P1191 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext())
		{
			int a = cin.nextInt();
			int b = cin.nextInt();
			int count = 0;
			for (int i=a; i<=b; i++){
				count += f(i);
			}
			System.out.println(count);
		}
		cin.close();
	}

	private static int f(int n) {
		int count = 0;
		while (n != 2)
		{
			if (n == 5)
				n = 4;
		
			if ( n % 2 == 0){
				n /= 2;
				count++;
			}
			if (n == 1)
			{
				count += 2;
				n = 2;
			}
			if (n == 0) {
				count += 1;
				n = 2;
			}
			if (n == 3){
				count += 2;
				n = 2;
			}
			if (n > 5){
				n /= 2;
				count++;
			}
		}
		return count;
	}
}
