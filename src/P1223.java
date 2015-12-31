import java.util.Scanner;

public class P1223 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext())
		{
			int m = cin.nextInt();
			int n = cin.nextInt();
			int k = cin.nextInt();
			if (k + (m-n)*2.5 >= m){
				System.out.println("You have slain an enemy");
			}else System.out.println("You have been slayed");
		}
		cin.close();
	}
}
