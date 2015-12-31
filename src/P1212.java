import java.util.Scanner;

public class P1212 {
	public static void main(String[] args) {
		Scanner cin  = new Scanner(System.in);
		while (cin.hasNext())
		{
			String op = cin.next();
			int a = cin.nextInt();
			int b = cin.nextInt();
			int L = a;
			if ( b > L) L = b;
			int S = a;
			if (b < S ) S = b;
			if(op.equals("L")){
				System.out.println(L);
			}else if (op.equals("S")){
				System.out.println(S);
			}else{
				System.out.println("Input error!");
			}
		}
		cin.close();
	}
}
