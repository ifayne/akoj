import java.util.Scanner;

//WA 这个在南阳上是没有问题的，不知道为什么在我们OJ上不行
public class P1115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			int c = cin.nextInt();
			int result = (a * 70 + b * 21 + c * 15) % 105;
			if (result < 10 || result > 100) {
				System.out.println("No answer");

			} else
				System.out.println(result);
		}
		cin.close();
	}

}
