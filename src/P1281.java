import java.util.Scanner;

public class P1281 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0)
		{
			String aString = cin.next().replaceAll("[abc]", "2").replaceAll("[def]", "3").replaceAll("[ghi]", "4").replaceAll("[jkl]", "5").replaceAll("[mno]", "6").replaceAll("[pqrs]", "7").replaceAll("[tuv]", "8").replaceAll("[wxyz]", "9");
			System.out.println(aString);
		}
		cin.close();
	}
}
