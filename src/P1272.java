import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class P1272 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0)
		{
			int max = 0;
			char s = 0;
			String string = cin.next();
			char a[] = string.toCharArray();
			Arrays.sort(a);
			TreeMap<Character, Integer> map = new TreeMap<>();
			for (int i=0; i<a.length; i++){
				if (map.containsKey(a[i]))
					map.put(a[i], map.get(a[i])+1);
				else
					map.put(a[i], 1);
				if (map.get(a[i]) > max){
					max = map.get(a[i]);
					s = a[i];
				}
			}
			System.out.println(s);
		}
		cin.close();
	}
}
