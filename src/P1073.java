import java.util.Scanner;
import java.util.TreeMap;

public class P1073 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			String string = null;
			int max = 0;
			int n = cin.nextInt();
			if (n == 0)
				break;
			TreeMap<String, Integer> map = new TreeMap<>();
			for (int i = 0; i < n; i++) {
				String s = cin.next();
				if (map.containsKey(s)) {
					map.put(s, map.get(s) + 1);
				} else
					map.put(s, 1);
				if (map.get(s) > max) {
					max = map.get(s);
					string = s;
				}
			}
			System.out.println(string);
		}
		cin.close();
	}
}
