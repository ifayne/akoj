import java.util.Scanner;

public class P1301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while ( cin.hasNext() && cin.hasNext() ){
			int a = cin.nextInt();
			String b = cin.next();
			int sum = a + convert(b);
			System.out.println(sum);
		}
		cin.close();
	}

	private static int convert(String b) {
		// TODO Auto-generated method stub
		char ch[] = b.toCharArray();
		int sum = 0;
		for ( int i=b.length()-1; i>=0; i-- ){
			sum = sum * 10 + (ch[i] - '0');
		}
		
		return sum;
	}

}
