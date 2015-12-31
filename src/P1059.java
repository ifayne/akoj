
import java.util.Scanner;

public class P1059 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext())
		{
			int n = cin.nextInt();
			int m = cin.nextInt();
			printH(n);
			for (int i=0; i<m; i++){
				PrintW(n);
			}
			printH(n);
			System.out.println();
		}
		cin.close();
	}

	private static void PrintW(int n) {
		System.out.print("|");
		for (int i=0; i<n; i++){
			System.out.print(" ");
		}
		System.out.println("|");
	}

	private static void printH(int n) {
		System.out.print("+");
		for (int i=0; i<n; i++){
			System.out.print("-");
		}
		System.out.println("+");
	}
}
