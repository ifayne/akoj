import java.util.Scanner;

public class P1312 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while ( cin.hasNext()){
			long n = cin.nextLong();
			long s = cin.nextLong();
			System.out.println(-(n-1));
		}
		cin.close();
	}
}
