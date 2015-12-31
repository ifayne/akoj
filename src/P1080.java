import java.util.Scanner;
import java.util.TreeMap;

public class P1080 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0){
			int n = cin.nextInt();
			int a[] = new int[n];
			TreeMap<Integer, Integer> map = new TreeMap<>();
			for (int i=0; i<n; i++){
				int key = cin.nextInt();
				a[i] = key;
				if (map.containsKey(key))
					map.put(key, map.get(key)+1);
				else
					map.put(key, 1);
			}
			for (int i=0; i<n; i++){
				if (map.get(a[i]) % 2 == 1) {
					System.out.println(a[i]);
					break;
				}
			}
		}
		cin.close();
	}
}
