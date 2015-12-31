import java.util.Scanner;

public class P1005 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while ( t-- > 0 ){
			int a[] = new int[3];
			for ( int i=0; i<a.length; i++ ){
				a[i] = cin.nextInt();
			}
			if ( a[0] + a[1] == a[2] )
					System.out.println(a[0]+"+"+a[1]+"="+a[2]);
			else if ( a[0] - a[1] == a[2] )
				System.out.println(a[0]+"-"+a[1]+"="+a[2]);
			else if ( a[1] - a[0] == a[2] )
				System.out.println(a[1]+"-"+a[0]+"="+a[2]);
			else if ( a[0] * a[1] == a[2] )
					System.out.println(a[0]+"*"+a[1]+"="+a[2]);
			else {
				if ( a[1] != 0 && a[0] / a[1] == a[2]){
						System.out.println(a[0]+"/"+a[1]+"="+a[2]);
				}
				else if ( a[0] != 0 && a[1] / a[0] == a[2]){
						System.out.println(a[1]+"/"+a[0]+"="+a[2]);
				}
				else System.out.println("None");
			}
			
		}
		cin.close();
	}
}
