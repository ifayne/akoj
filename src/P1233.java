import java.util.Scanner;

public class P1233 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0) {
			String string = cin.next();
			char a[] = string.toCharArray();
			boolean first = false;
			for (int i=2; i<a.length-1; i++){
				if (a[i-1] == '/' && a[i-2] == '/')
					first = true;
				if (first)
					System.out.print(a[i]);
				if (i == a.length-1 || first == true && a[i+1] == '/' || a[i+1] == ':' && first == true){
					break;
				}
					
			}
			System.out.println();
		}
		cin.close();
	}
}
