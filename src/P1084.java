import java.util.Scanner;

public class P1084 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String s1 = cin.next();
			String s2 = cin.next();
			System.out.println(find(s1, s2));
		}
		cin.close();
	}

	private static int find(String s1, String s2) {
		int count = 0;
		int temp = s1.indexOf(s2);
		while (temp != -1) {
			count++;
			temp = s1.indexOf(s2, temp + 1);
		}
		return count;
	}
}
