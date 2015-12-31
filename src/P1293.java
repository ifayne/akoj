
import java.util.Scanner;

public class P1293 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String src = cin.next();
			String s = src.toLowerCase();
			char a[] = s.toCharArray();
			int word[] = new int[26];
			for (int i = 0; i < s.length(); i++) {
				word[a[i] - 'a']++;
			}
			for (int i = 0; i < 26; i++) {
				int max = 0, max_i = 0;
				for (int j = 0; j < 26; j++) {
					if (max < word[j]) {
						max = word[j];
						max_i = j;
					}
				}
				word[max_i] = 0;
				if (max == 0)
					break;
				System.out.print((char) (max_i + 'a'));
			}
			System.out.println();
		}
		cin.close();
	}

}
