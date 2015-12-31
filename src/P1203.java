import java.util.Scanner;

public class P1203 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while ( cin.hasNext() ){
			String s = cin.next();
			if (s.equals("0")) break;
			int sum = 0;
			char a[] = s.toCharArray();
			for (int i=0; i<s.length(); i++ ){
				sum += (a[i]-'0');
			}
			System.out.println(sum);
		}
		cin.close();
	}
}
