import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/*
 * result£ºWA
 * 2015-12-11 22:36:26
 * author£ºFayne
 */
public class P1043 {
	static class Pro{
		int i, j;
		int value;
		Pro(int i, int j, int value){
			this.i = i;
			this.j = j;
			this.value = value;
		}
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		Pro[] w = new Pro[n*n];
		int count = 0;
		for (int i=0; i<n; i++){
			for (int j=0; j<n; j++){
				w[count++] = new Pro(i, j, cin.nextInt());
			}
		}
		Arrays.sort(w, new Comparator<Pro>() {

			@Override
			public int compare(Pro o1, Pro o2) {
				return o1.value-o2.value;
			}
		});
		int sum = 0;
		int a[] = new int[n];
		for (int i=0; i<n; i++){
			a[i] = 0;
		}
		for (int i=0; i<n*n; i++){
			if(a[w[i].j] == 0){
				sum += w[i].value;
				a[w[i].j] = 1;
			}
		}
		System.out.println(sum);
		cin.close();
	}
}
