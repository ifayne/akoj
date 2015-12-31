import java.util.Arrays;
import java.util.Scanner;

public class P1097 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int a[] = new int[3];
		a[0] = cin.nextInt();
		a[1] = cin.nextInt();
		a[2] = cin.nextInt();
		Arrays.sort(a);
		System.out.println(a[0]+" "+a[1]+" "+a[2]);
		cin.close();
	}

}
