
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P1172 {
	static class Gang{
		int length, d;
		long No;
		Gang(int length, int d, long No){
			this.length = length;
			this.d = d;
			this.No = No;
		}
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()){
			int t = cin.nextInt();
			while (t-- > 0){
				int n = cin.nextInt();
				Gang gang[] = new Gang[n];
				for (int i=0; i<n; i++){
					gang[i] = new Gang(cin.nextInt(), cin.nextInt(), cin.nextLong());
				}
				Arrays.sort(gang, new Comparator<Gang>() {

					@Override
					public int compare(Gang arg0, Gang arg1) {
						if (arg0.length > arg1.length || arg0.length == arg1.length && arg0.d < arg1.d || arg0.length == arg1.length && arg0.d == arg1.d && arg0.No > arg1.No)
							return -1;
						return 1;
					}
				});
				System.out.println(gang[0].No);
			}
		}
		cin.close();
	}
}
