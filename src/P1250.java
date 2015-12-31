import java.util.Scanner;

public class P1250 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0){
			Scanner in = new Scanner(cin.next());
			in.useDelimiter("[.]+");
			boolean judge = true;
			while (in.hasNext()){
				int n = in.nextInt();
				if (n > 255 || n < 0)
					judge = false;
			}
			if(judge){
				System.out.println("Yes!");
			}else
				System.out.println("No!");
			in.close();
		}
		cin.close();
	}
}
