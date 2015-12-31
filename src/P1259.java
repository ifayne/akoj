import java.util.Scanner;

public class P1259{
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String s1 = cin.next().toLowerCase();
			String s2 = cin.next().toLowerCase();
			if (s1.length() == s2.length()){
				if (s1.equals(s2)){
					System.out.println("yes");
				}else {
					System.out.println("no");
				}
			}else if (s1.length() + 1 == s2.length()){
				char a[] = s1.toCharArray();
				char b[] = s2.toCharArray();
				boolean first = true;
				int i = 0, j = 0;
				for ( i=0, j=0;i<a.length && j<b.length;i++, j++){
					if (a[i] != b[j] && first){
						j++;
						first = false;
					}else if (a[i] != b[j] && !first){
						break;
					}
				}
				if (i != a.length && j != b.length){
					System.out.println("no");
				}else{
					System.out.println("yes");
				}
			}else if (s1.length() == s2.length() + 1){
				char a[] = s1.toCharArray();
				char b[] = s2.toCharArray();
				boolean first = true;
				int i = 0, j = 0;
				for ( i=0, j=0;i<a.length && j<b.length;i++, j++){
					if (a[i] != b[j] && first){
						i++;
						first = false;
					}else if (a[i] != b[j] && !first){
						break;
					}
				}
				if (i != a.length && j != b.length){
					System.out.println("no");
				}else{
					System.out.println("yes");
				}
			}else {
				System.out.println("no");
			}
		}
		cin.close();
	}
}