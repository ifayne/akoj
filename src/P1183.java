import java.util.Scanner;

public class P1183 {

	@SuppressWarnings("unused")
	private static int count;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while ( cin.hasNext() ){
			int n = cin.nextInt();
			int b = cin.nextInt();
			count = 0;
			System.out.println(f(n, b));
		}
		cin.close();
	}

	private static int f(int n, int b) {
		// TODO Auto-generated method stub
		int cnt = 0;
		for ( int i=1; i<=n;){
			if ( i % b == 0){
				cnt++;
				i += b;
			}else{
				i++;
			}
		}
		return cnt;
	}

}
