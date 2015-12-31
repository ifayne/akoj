import java.util.Scanner;

public class P1127 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int m = cin.nextInt();
		int count = 1;
		long s= 0, t = 1;
		while(count <= m){
			t *= count;
			s += t;
			count++;
		}
		System.out.println(s);
		cin.close();
	}

}
