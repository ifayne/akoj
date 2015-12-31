import java.text.DecimalFormat;
import java.util.Scanner;

public class P1177 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while ( cin.hasNext() ){
			int x1 = cin.nextInt();
			int y1 = cin.nextInt();
			int x2 = cin.nextInt();
			int y2 = cin.nextInt();
			int x3 = cin.nextInt();
			int y3 = cin.nextInt();
			if ( x1 == 0 && x2 == 0 && x3 == 0 && y1 == 0 && y2 == 0 && y3 == 0)break;
			double a = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
			double b = Math.sqrt(Math.pow(x3-x1, 2) + Math.pow(y3-y1, 2));
			double c = Math.sqrt(Math.pow(x2-x3, 2) + Math.pow(y2-y3, 2));
			DecimalFormat df = new DecimalFormat("0.0");
			System.out.println(df.format(area(a, b, c)));
		}
		cin.close();
	}

	private static Object area(double a, double b, double c) {
		// TODO Auto-generated method stub
		double s = (a + b + c) / 2;
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		return area;
	}
}
