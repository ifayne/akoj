import java.util.Scanner;

public class P1340 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		String s = cin.next();
		int p = 0;
		boolean first = true;
		String a[] = new String[n];
		for (int i=0; i<n; i++){
			a[i] = cin.next();
			if (s.equals(a[i]) && first){
				first = false;
				p = i+1;
			}
		}
		if ( p == 0 )
			System.out.println("try again");
		else
			System.out.println(p);
		cin.close();
	}
}
