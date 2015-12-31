import java.util.Arrays;
import java.util.Scanner;

public class P1184 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0){
			String s = cin.next();
			char a[] = s.toCharArray();
			Arrays.sort(a);
			System.out.print(a[s.length()-1]);
			int i = s.length()-2;
			for ( ; i>=0; i--){
				System.out.print(" "+a[i]);
			}
			System.out.println();
		}
		cin.close();
	}

}
