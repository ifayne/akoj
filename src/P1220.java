import java.util.Scanner;

//WA
public class P1220 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			if (n == 1)
				System.out.println("1 frog has 1 mouth, 2 eyes and 4 legs, plop dives into the water.");
			else {
				System.out.printf("%d frogs have %d mouths, %d eyes and %d legs, ", n, n, n * 2, n * 4);
				for (int k = 0; k < n; k++) {
					System.out.print("plop ");
				}
				System.out.println("dive into the water.");
			}
		}
		cin.close();
	}
}
