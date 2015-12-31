import java.util.Scanner;

public class P1261 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String a[] = cin.nextLine().trim().split("\\s+");
			int t = cin.nextInt();
			while (t-- > 0) {
				String b[] = cin.nextLine().trim().split("\\s+");
				if (b.length < 40) {
					t++;
					continue;
				}
				int sing = 0, doub = 0, jud = 0;
				for (int i=0; i<10; i++){
					if (a[i].equals(b[i]))
						jud++;
				}
				for (int i=10; i<30; i++) {
					if (a[i].equals(b[i]))
						sing += 2;
				}
				for (int i=30; i<40; i++) {
					if (a[i].equals(b[i]))
						doub += 5;
				}
				System.out.println(jud + sing + doub);
			}
		}
		cin.close();
	}
}
