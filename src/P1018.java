import java.util.Scanner;

public class P1018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while ( cin.hasNext()){
			int n = cin.nextInt();
			int a[] = new int[n];
			for ( int i=0; i<n; i++ ){
				a[i] = cin.nextInt();
			}
			int count = 1, max = 1;
			for ( int i=1; i<n; i++ ){
				if ( a[i] == a[i-1]){
					count++;
				}else count = 1;
				if ( count > max  ){
					max = count;
				}
			}
			System.out.println(max);
		}
		cin.close();
	}

}
