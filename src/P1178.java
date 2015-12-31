
import java.util.Scanner;

public class P1178 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int t = cin.nextInt();
			while (t-- > 0) {
				String string = cin.next();
				char a[] = string.toCharArray();
				int word[] = new int[26];
				for (int i=0; i<26; i++)
					word[i] = 0;
				for (int i=0; i<a.length; i++){
					word[a[i]-'a']++;
				}
				int max = 0, min = a.length;
				for (int i=0; i<26; i++){
					if (min > word[i] && word[i] != 0)
						min = word[i];
					if (max < word[i] && word[i] != 0)
						max = word[i];
				}
				if (isPrime(max - min)) {
					System.out.println("Lucky Word");
					System.out.println(max - min);
				} else {
					System.out.println("No Answer");
					System.out.println("0");
				}
			}
		}
		cin.close();
	}

	private static boolean isPrime(int n) {
		if (n == 1 || n == 0)
			return false;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
