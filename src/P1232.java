import java.util.Scanner;

public class P1232 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0){
			String s1 = cin.next();
			String s2 = cin.next();
			System.out.println(s1.indexOf(s2));
		}
		cin.close();
	}
}
