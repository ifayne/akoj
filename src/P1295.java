import java.util.HashMap;
import java.util.Scanner;

public class P1295{
	static class Weibo{
		String name;
		int to, have;
		Weibo(String name){
			this.name = name;
			to = have = 0;
		}
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		while (cin.hasNext()) {
			int n = cin.nextInt();
			Weibo weibo[] = new Weibo[n];
			for (int i=0; i<n; i++){
				weibo[i] = new Weibo(cin.next());
				map.put(weibo[i].name, i);
			}
			int t = cin.nextInt();
			for (int i=0; i<t; i++){
				String s1 = cin.next();
				cin.next();
				String s2 = cin.next();
				if (s1.equals(s2))
					continue;
				else {
					if (map.containsKey(s1)){
						weibo[map.get(s1)].to++;
					}if (map.containsKey(s2)){
						weibo[map.get(s2)].have++;
					}
				}
			}
			for (int i=0; i<n; i++){
				System.out.println(weibo[i].name+" "+weibo[i].have+" "+weibo[i].to);
			}
			System.out.println();
		}
		cin.close();
	}
}