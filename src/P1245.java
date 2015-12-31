import java.util.Scanner;

public class P1245 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext())
		{
			long n = cin.nextLong(), sum = 0;
			if (f(n) == 3){
				long tmp = n;
				while (n != 0){
					sum += pow(n%10, 3);
					n /= 10;
				}
				if (sum == tmp)
					System.out.println("Daffodil");
				else 
					System.out.println("Nothing");
				
			}else if (f(n) == 4){
				long tmp = n;
				while (n != 0){
					sum += pow(n%10, 4);
					n /= 10;
				}
				if (sum == tmp)
					System.out.println("Class Flower");
				else 
					System.out.println("Nothing");
			}else if (f(n) == 5){
				long tmp = n;
				while (n != 0){
					sum += pow(n%10, 5);
					n /= 10;
				}
				if (sum == tmp)
					System.out.println("Grade Flower");
				else 
					System.out.println("Nothing");
			}
			else if (f(n) == 6){
				long tmp = n;
				while (n != 0){
					sum += pow(n%10, 6);
					n /= 10;
				}
				if (sum == tmp)
					System.out.println("OH~");
				else 
					System.out.println("Nothing");
			}else {
				System.out.println("Nothing");
			}
		}
		cin.close();
	}

	private static long pow(long x, int n) {
		if (n == 0 || x == 1)
			return 1;
		if (x == 0)
			return 0;
		if (n % 2 == 0)
			return pow(x*x, n/2);
		else
			return pow(x*x, n/2)*x;
	}

	private static long f(long n) {
		return n < 10 ? 1 : f(n/10) + 1;
	}
}
