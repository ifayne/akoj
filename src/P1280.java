import java.util.Scanner;

public class P1280 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0){
			int n = cin.nextInt();
			long s = 0;
			for (int i=1; i<=n; i++){
				s += f(i);
			}
			System.out.println(s);
		}
		cin.close();
	}

	private static long f(int n) {
		long s = 1;
		for (int i=1; i<=n; i+=2){
			s *= i;
		}
		return s;
	}
}
