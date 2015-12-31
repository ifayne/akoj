import java.util.Scanner;

public class P1051 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext())
		{
			Scanner in = new Scanner(cin.nextLine());
			while (in.hasNext())
			{
				String s = in.next();
				String tString = s.substring(0, 1).toUpperCase()+s.substring(1);
				System.out.print(tString + " ");
			}
			System.out.println();
			in.close();
		}
		cin.close();
	}
}
