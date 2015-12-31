import java.util.Scanner;

public class P1219 {
	static final String [] pok= {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0) {
			String aString = cin.next();
			String bString = cin.next();
			if (f(aString) > f(bString))
				System.out.println(">");
			else if (f(aString) == f(bString))
				System.out.println("=");
			else {
				System.out.println("<");
			}
		}
		cin.close();
	}
	private static int f(String string) {
		for (int i=0; i<pok.length; i++){
			if(pok[i].equals(string))
				return i;
		}
		return 0;
	}
}
