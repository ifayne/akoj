import java.util.Scanner;

public class P1136 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt(), i = 1;
			while ( i <= n )
			{
				if ( i % 7 == 0 || i / 10 == 7 || i % 10 == 7 || i / 100 == 7 || i / 1000 == 7 || i/10%10 == 7 || i /100 % 10 == 7){
					System.out.println(i);
				}
				i++;
			}

		cin.close();
	}

}
