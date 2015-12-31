import java.util.Scanner;

public class P1012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		String a[] = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011",
				"1100", "1101", "1110", "1111" };
		while (cin.hasNext()) {
			String s = cin.next();
			char hex[] = s.toCharArray();
			for (int i = 0; i < s.length(); i++) {
				if (hex[i] >= '0' && hex[i] <= '9') {
					System.out.print(a[hex[i] - '0']);
				} else {
					System.out.print(a[hex[i] - 'A' + 10]);
				}
			}
			System.out.println();
		}
		cin.close();
	}

}
