import java.util.Scanner;

public class P1344 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()){
			int m = cin.nextInt();
			int n = cin.nextInt();
			int count = 0;
			for (int i=m; i<=n; i++){
				if (i<10)
					count++;
				else{
					if ( f(i) )
						count++;
				}
			}
			System.out.println(count);
		}
		cin.close();
	}

	private static boolean f(int i) {
		// TODO Auto-generated method stub
		if (i<100 && i >= 10){
			if (i/10 == i%10) 
				return true;
		}
		if ( i < 1000 && i > 100){
			if ( i /100 == i % 10 )
				return true;
		}
		if ( i >= 1000 && i<10000){
			if ( i / 1000 == i % 10 && i/100%10 == i/10%10)
				return true;
		}
		return false;
	}
}
