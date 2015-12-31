import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P1023 {
	static class Dna{
		String DNA;
		int count;
		int Count(){
			int count = 0;
			char a[] = DNA.toCharArray();
			for (int i=0; i<DNA.length()-1; i++){
				for (int j=i+1; j<DNA.length(); j++){
					if (a[i] > a[j])
						count++;
				}
			}
			return count;
		}
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		Dna a[] = new Dna[t];
		for (int i=0; i<t; i++){
			a[i] = new Dna();
			a[i].DNA = cin.next();
			a[i].count = a[i].Count();
		}
		Arrays.sort(a, new Comparator<Dna>() {

			@Override
			public int compare(Dna arg0, Dna arg1) {
				return arg0.count-arg1.count;
			}
		});
		for (int i=0; i<t; i++){
			System.out.println(a[i].DNA);
		}
		cin.close();
	}
}
