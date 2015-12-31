import java.util.Arrays;
import java.util.Scanner;

public class P1164 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext())
		{
			int a[] = new int[3];
			for (int i=0; i<3; i++){
				a[i] = cin.nextInt();
			}
			Arrays.sort(a);
			int cos = a[0]*a[0] + a[1]*a[1] - a[2]*a[2];
			if (cos > 0)
				System.out.println("Actue Triangle");
			else if (cos == 0)
				System.out.println("Rect Triangle");
			else 
				System.out.println("Obtuse Triangle");
		}
		cin.close();
	}
}
