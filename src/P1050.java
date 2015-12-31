import java.util.Scanner;

public class P1050 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		cin.nextLine();
		while (t-- > 0)
		{
			String string = cin.nextLine();
			char a[] = string.toCharArray();
			if (a[0] >= '0' && a[0] <= '9')
				System.out.println("no");
			else{
				boolean judge = true;
				for (int i=0; i<a.length; i++){
					if (!(a[i] >= 'a' && a[i] <= 'z' || a[i] >= 'A' && a[i] <= 'Z' || a[i] == '_' || a[i] >= '0' && a[i] <= '9')){
						judge = false;
						break;
					}
				}
				if (judge)
					System.out.println("yes");
				else
					System.out.println("no");
			}
		}
		cin.close();
	}
}
