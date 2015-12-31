import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P1185 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0) {
			int n = cin.nextInt();
			System.out.println(solve(n));
		}
		cin.close();
	}

	private static int solve(int n) {
		int count = 0;
		while (n != 6174){
			int a = sort1(n);
			int b = sort2(n);
			n = a - b;
			count++;
		}
		return count + 1;
	}

	private static int sort2(int n) {
		char a[] = Integer.toString(n).toCharArray();
		Arrays.sort(a);
		return Integer.parseInt(new String(a));
	}

	private static int sort1(int n) {
		char a[] = Integer.toString(n).toCharArray();
		Character newA[] = new Character[a.length];
		for (int i=a.length-1, j=0; i>=0; i--){
			newA[j++] = a[i];
		}
		Arrays.sort(newA, Collections.reverseOrder());
		for (int i=0; i<a.length; i++){
			 a[i] = newA[i];
		}
		return Integer.parseInt(new String(a));
	}
}
