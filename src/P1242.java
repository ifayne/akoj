import java.util.HashMap;
import java.util.Scanner;

public class P1242 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		HashMap<String, Double> map = new HashMap<>();
		map.put("GS", 4.0);
		map.put("JSJ", 3.4);
		map.put("XD", 2.7);
		map.put("YY", 1.5);
		map.put("MY", (double) 0);
		while (cin.hasNext()) {
			int t = cin.nextInt();
			while (t-- > 0) {
				String score = cin.next();
				if (map.containsKey(score)) {
					if (map.get(score) != 0)
						System.out.printf("%.1f\n", map.get(score));
					else
						System.out.println("0");
				} else {
					solve(Integer.valueOf(score));
				}
			}
		}
		cin.close();
	}

	private static void solve(int score) {
		double result = 0;
		if (score >= 90 && score <= 100)
			result = 4.0;
		else if (score >= 85 && score <= 89)
			result = 3.6;
		else if (score >= 80 && score <= 84)
			result = 3.2;
		else if (score >= 75 && score <= 79)
			result = 2.8;
		else if (score >= 70 && score <= 74)
			result = 2.3;
		else if (score >= 65 && score <= 69)
			result = 1.8;
		else if (score >= 60 && score <= 64)
			result = 1.3;
		else
			result = 0;
		if (result != 0)
			System.out.printf("%.1f\n", result);
		else
			System.out.println("0");
	}
}
