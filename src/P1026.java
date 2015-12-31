import java.util.Scanner;

public class P1026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();
		int count = 0;
		for ( int i=a; i<=b;  ){
			if ( i % 15 != 0 ){
				i++;
			}else{
				count++;
				i += 15;
			}
		}
		System.out.println(count);
		cin.close();
	}

}
