import java.util.Scanner;

public class P1255 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while ( cin.hasNext())
		{
			String s  = cin.next();
			if (s.equals("Rocks"))
				System.out.println("Papers");
			if (s.equals("Scissors"))
				System.out.println("Rocks");
			if (s.equals("Papers"))
				System.out.println("Scissors");
		}
		cin.close();
	}
}
