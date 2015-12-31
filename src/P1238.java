import java.util.Scanner;

public class P1238 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int t = cin.nextInt();
			int max = 0;
			String tString = null;
			for (int c = 0; c < t; c++) {
				String string = cin.next();
				String match = "8";
				char a[] = string.toCharArray();
				int count = 0;
				for (int i = 0; i < a.length; i++) {
					if (match.equals(String.valueOf(a[i])))
						count++;
				}
				if (max < count) {
					max = count;
					tString = string;
				}
			}
			System.out.println(tString);
		}
		cin.close();
	}
}
