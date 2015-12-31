import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class P1248 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			if (n == 0)
				break;
			List<Integer> list = new LinkedList<>();
			for (int i=1; i<=n; i++)
				list.add(i);
			int j = 0;
			for (int i=0; i<n-1; i++){
				j = (j + 1) % list.size();
				list.remove(j);
			}
			System.out.println(list.get(0));
		}
		cin.close();
	}
}
