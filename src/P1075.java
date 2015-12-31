import java.util.Scanner;

public class P1075 {
	final static int mon[] = {29, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()){
			String string[] = cin.next().trim().split("[/]+");
			int year = Integer.parseInt(string[0]);
			int month = Integer.parseInt(string[1]);
			int day = Integer.parseInt(string[2]);
			int sumM = 0;
			for (int i=1; i<month; i++){
				if ( i == 2 && isLeap(year)){
					sumM += mon[0];
				}else
					sumM += mon[i];
			}
			System.out.println(sumM + day);
		}
		cin.close();
	}
	private static boolean isLeap(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}

}
