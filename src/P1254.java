import java.util.Scanner;

public class P1254 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext())
		{
			String s[] = cin.nextLine().trim().split("\\s+");
			System.out.print(s[s.length-1]);
			for (int i=s.length-2; i>=0; i--)
				System.out.print(" "+s[i]);
			System.out.println();
		}
		cin.close();
	}
}
