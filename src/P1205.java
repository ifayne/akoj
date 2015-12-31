import java.util.Scanner;

public class P1205 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext())
		{
			String aString = cin.nextLine().trim().replaceAll("[1]", "1").replaceAll("[abc]", "2").replaceAll("[def]", "3").replaceAll("[ghi]", "4").replaceAll("[jkl]", "5").replaceAll("[mno]", "6").replaceAll("[pqrs]", "7").replaceAll("[tuv]", "8").replaceAll("[wxyz]", "9");
			char a[] = aString.toCharArray();
			for (int i=0; i<a.length; i++){
				if (a[i] >= 'A' && a[i] <= 'Z'){
					if (a[i] == 'Z') a[i] = 'a';
					else {
						a[i] = (char) (a[i] - 'A' + 'a' + 1);
					}
				}
			}
			System.out.println(new String(a));
		}
		cin.close();
	}
}
