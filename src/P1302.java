import java.util.Scanner;

public class P1302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int a[] = {1, 0, 0, 0, 0, 0, 1, 0, 2, 1};
		while ( cin.hasNext() )
		{
			String s = cin.next();
			char ch[] = s.toCharArray();
			int sum = 0;
			for ( int i=0; i<s.length(); i++ ){
				sum += (a[ch[i] - '0']);
			}
			System.out.println(sum);;
		}
		cin.close();
	}

}
