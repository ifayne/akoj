
import java.util.Scanner;

public class P1239 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext())
		{
			int a[] = new int[4];
			boolean judge = true;
			for (int i=0; i<4; i++){
				a[i] = cin.nextInt();
				if (a[i] != 0)
					judge = false;
			}
			
			if (judge)
				break;
			if (a[0] == a[1] && a[1] == a[2] && a[2] == a[3])
				System.out.println("1");
			else if (a[0] > a[1] && a[1] == a[2] && a[2] == a[3])
				System.out.println("2");
			else if (a[1] == a[0] && a[1] > a[2] && a[2] == a[3])
				System.out.println("3");
			else System.out.println("4");
			
			
		}
		cin.close();
	}
}
