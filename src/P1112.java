import java.text.DecimalFormat;
import java.util.Scanner;

public class P1112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int min=10000, max = -10000,  count = 0;
		double sum = 0;
		while ( cin.hasNext() )
		{
			int data = cin.nextInt();
			sum += data;
			if ( data > max ) max = data;
			if ( data < min ) min = data;
			count++;
		}
		DecimalFormat df = new DecimalFormat(".000");
		System.out.println(min+" "+max+" "+df.format(sum/(double)(count)));
		cin.close();
	}

}
