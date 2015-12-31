import java.util.HashMap;
import java.util.Scanner;

public class P1291 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		map.put("2", 2);
		map.put("3", 3);
		map.put("4", 4);
		map.put("5", 5);
		map.put("6", 6);
		map.put("7", 7);
		map.put("8", 8);
		map.put("9", 9);
		map.put("10", 10);
		map.put("J", 10);
		map.put("Q", 10);
		map.put("K", 10);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int m = cin.nextInt();
			int host = 0, guest = 0, hostA = 0, guestA = 0;
			for (int i = 0; i < n; i++) {
				String pString = cin.next();
				if (pString.equals("A")) {
					hostA++;
					host++;
				}
				if (map.containsKey(pString)) {
					host += map.get(pString);
				}
			}
			for (int i = 0; i < m; i++) {
				String pString = cin.next();
				if (pString.equals("A")) {
					guestA++;
					guest++;
				}
				if (map.containsKey(pString)) {
					guest += map.get(pString);
				}
			}
			if (host > 21) {
				host = 0;
			} else {
				while (hostA-- > 0 && host <= 11)
					host += 10;
			}
			if (guest > 21) {
				guest = 0;
			} else {
				while (guestA-- > 0 && guest <= 11)
					guest += 10;
			}
			if (host >= guest) {
				System.out.println(host + " vs " + guest + " HOST WIN");
			} else
				System.out.println(host + " vs " + guest + " GUEST WIN");
		}
		cin.close();
	}
}
