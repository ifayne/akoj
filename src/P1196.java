import java.util.Scanner;

public class P1196 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int t = cin.nextInt();
			while (t-- > 0) {
				String s1 = cin.next();
				String s2 = cin.next();
				System.out.println(s1 + s2);
			}
		}
		cin.close();
	}

}
