
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeMap;

public class P1046 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {

		while (cin.hasNext() && solve())
			;
		closeIO();
	}

	static void closeIO() {
		// TODO Auto-generated method stub
		if (cin != null)
			cin.close();
		if (cout != null)
			cout.close();
	}

	private static boolean solve() {
		// TODO Auto-generated method stub
		String s[] = cin.nextLine().trim().toLowerCase().split("\\s+");
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		for (String word : s)
			if (map.containsKey(word))
				map.put(word, map.get(word) + 1);
			else {
				map.put(word, 1);
			}
		cout.println(s.length);
		for (String word : map.keySet())
			cout.println(String.format("%s:%d", word, map.get(word)));
		return false;
	}
}
