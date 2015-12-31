import java.util.Scanner;

public class P1249 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()){
			int n = cin.nextInt();
			int p = 1, q = 2, r = 0;
			if (n==1 || n==2)
				System.out.println(n);
			else{
				while( n-- > 2){
					r = p + q;
					p = q;
					q = r;
				}
				System.out.println(r);
			}
		}
		cin.close();
	}
}
