import java.util.Scanner;

public class P1285 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int Na = cin.nextInt();
		int A[] = new int[Na];
		for ( int i=0; i<Na; i++ ){
			A[i] = cin.nextInt();
		}
		int Nb = cin.nextInt();
		int B[] = new int[Nb];
		for (int i=0; i<Nb; i++){
			B[i] = cin.nextInt();
		}
		int C[] = new int[Na];
		int count = 0;
		for ( int i=0; i<Na; i++){
			for ( int j=0; j<Nb; j++){
				if ( A[i] == B[j]){
					break;
				}
				if ( j == Nb -1){
					C[count++] = i;
				}
			}
		}
		System.out.print(count);
		for ( int i=0; i<count; i++){
			System.out.print(" "+(C[i]+1));
		}System.out.println();
		cin.close();
	}
}
