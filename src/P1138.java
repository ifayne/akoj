import java.util.Scanner;

public class P1138 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while ( t-- > 0 ){
			String s = cin.next();
			char a[] = s.toCharArray();
			int count = 1;
			for ( int i=1; i<s.length(); i++ ){
				if ( a[i] == a[i-1] ){
					count++;
				}
				else{
					System.out.print(count+""+a[i-1]);
					count = 1;
				}
			}
			if ( count != 1 ){
				System.out.println(count+""+a[s.length()-1]);
			}else System.out.println("1"+a[s.length()-1]);
		}
		cin.close();
	}
}
