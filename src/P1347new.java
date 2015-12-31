import java.util.Scanner;

public class P1347new {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			long n = cin.nextLong();
			long count = 0, s = 1;
			for (long i=1; i<=n; i++){
				s *= i;
				while (s % 10 == 0){
					count++;
					s /= 10;
				}
				s %= 10000;
			}

			System.out.println(count);
		}
		cin.close();
	}
	}
