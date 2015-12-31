import java.util.Scanner;

public class P1246 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String c = cin.nextLine();
			int t = Integer.valueOf(c);
			while (t-- > 0) {
				String a[] = cin.nextLine().trim().split("\\W+");
				for (int i=0; i<a.length; i++) {
					System.out.print(a[i].substring(0, 1).toUpperCase());
					if (a[i].length() > 1)
						System.out.print(a[i].substring(1));
					if (i < a.length-1)
						System.out.print(" ");
				}
				System.out.println(".");
			}
		}
		cin.close();
	}
}
