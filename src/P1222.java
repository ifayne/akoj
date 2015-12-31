import java.util.Arrays;
import java.util.Scanner;

public class P1222 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()){
			int a1[] = new int[3];
			int a2[] = new int[3];
			for (int i=0; i<3; i++)
				a1[i] = cin.nextInt();
			for (int i=0; i<3; i++)
				a2[i] = cin.nextInt();
			Arrays.sort(a1);
			Arrays.sort(a2);
			if (judge(a1[0], a1[1], a1[2]) > judge(a2[0], a2[1], a2[2]))
				System.out.println("you win");
			else if (judge(a1[0], a1[1], a1[2]) < judge(a2[0], a2[1], a2[2]))
				System.out.println("you lose");
		}
		cin.close();
	}

	private static int judge(int a, int b, int c) {
		int sum = 0;

		if (a == b && b == c){
			a *= 10000;
			b *= 10000;
			c *= 10000;
		}
		else if (a + 1 == b && b == c - 1){
			a *= 1000;
			b *= 1000;
			c *= 1000;
		}
		else if (a == b || b == c || a == c){
			if (a == b){
				a *= 1000;
				b *= 1000;
			}
			if (b == c) {
				b *= 1000;
				c *= 1000;
			}
			if (a == c){
				a *= 1000;
				c *= 1000;
			}
		}else {
			c *= 2;
			b *= 5;
			c *= 10;
		}
		return a + b + c;
	}
}
