import java.util.Scanner;


public class P1010 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int x = cin.nextInt(), y = cin.nextInt(), m = cin.nextInt(), n = cin.nextInt();
			long L = cin.nextLong(), k = 1;
			for (k=1; ; k++){
				if ((x + m * k) % L == (y + n * k) % L ){
					System.out.println(k);
					break;
				}
				if ((x + m * k) % L == x && (y + n * k) % L == y){
					System.out.println("Impossible");
					break;
				}
			}
		}
		cin.close();
	}
}
