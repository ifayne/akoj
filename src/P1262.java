import java.util.Scanner;

public class P1262 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext())
		{
			String s1 = cin.next();
			String s2 = cin.next();
			String a[] = {"Rocks", "Papers", "Scissors"};
			if (s1.equals(s2))
				System.out.println("draw");
			else{
				if (s1.equals(a[0]) && s2.equals(a[1]) || s1.equals(a[1]) && s2.equals(a[2]) || s1.equals(a[2]) && s2.equals(a[0]))
						System.out.println("lose");
				else
					System.out.println("win");
			}
		}
		cin.close();
	}
}
