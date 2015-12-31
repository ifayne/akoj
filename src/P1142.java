import java.util.Scanner;

public class P1142 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0) {
			String s1 = cin.next();
			String s2 = cin.next();
			char a1[] = s1.toCharArray();
			char a2[] = s2.toCharArray();
			int word1[] = new int[26];
			int word2[] = new int[26];
			for (int i = 0; i < s1.length(); i++) {
				word1[a1[i] - 'a']++;
			}
			for (int i = 0; i < s2.length(); i++) {
				word2[a2[i] - 'a']++;
			}
			boolean re = true;
			for (int i = 0; i < 26; i++) {
				if (word1[i] != 0 && word2[i] == 0 || word1[i] == 0 && word2[i] != 0) {
					re = false;
					break;
				}
			}
			if (re) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		cin.close();
	}
}
