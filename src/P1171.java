
import java.util.Scanner;

public class P1171 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int t = cin.nextInt();
			while (t-- > 0) {
				String string = cin.next();
				char[] a = string.toCharArray();
				int r = 0, w = 0, b = 0;
				for (int i=0; i<a.length; i++){
					if (a[i] == 'R') r++;
					if (a[i] == 'W') w++;
					if (a[i] == 'B') b++;
				}
				for (int i=0; i<r; i++)
					System.out.print("R");
				for (int i=0; i<w; i++)
					System.out.print("W");
				for (int i=0; i<b; i++)
					System.out.print("B");
				System.out.println();
				
			}
		}
		cin.close();
	}
}
