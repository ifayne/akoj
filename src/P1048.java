import java.util.Scanner;

public class P1048 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = Integer.valueOf(cin.nextLine());
			char a[] = new char[n];
			String s[] = cin.nextLine().trim().split("[\\t]+");
			for (int i=0; i<n; i++){
				a[i] = s[i].charAt(0);
			}
			Perm(a, 0, n - 1);
		}
		cin.close();
	}

	private static void Perm(char a[], int begin, int end) {
		if (begin == end){
			System.out.println(new String(a));
		}else {
			for (int i=begin; i<=end; i++){
				move(a, begin, i);
				Perm(a, begin + 1, end);
				reMove(a, begin, i);
			}
		}
		
	}

	private static void reMove(char[] a, int begin, int i) {
		char t = a[begin];
		int j = begin;
		while (j < i){
			a[j] = a[j+1];
			j++;
		}
		a[i] = t;
	}

	private static void move(char[] a, int begin, int i) {
		char t = a[i];
		int j = i;
		while (j > begin){
			a[j] = a[j-1];
			j--;
		}
		a[begin] = t;
	}
}
