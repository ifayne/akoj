import java.text.DecimalFormat;
import java.util.Scanner;

public class P1118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while ( cin.hasNext() )
		{
			double h = 0;
			int n = cin.nextInt();
			for ( int i=1; i<=n;i++ ){
				h += (1.0/(double)i);
			}
			DecimalFormat df = new DecimalFormat(".000");
			System.out.println(df.format(h));
		}
		cin.close();
	}

}
