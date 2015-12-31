import java.util.Scanner;
import java.util.TreeMap;

public class P1253 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()){
			TreeMap<Character, Integer> map = new TreeMap<>();
			String string = cin.next();
			char a[] = string.toCharArray();
			for (int i=0; i<a.length; i++){
				if (map.containsKey(a[i]))
					map.put(a[i], map.get(a[i]) + 1);
				else{
					map.put(a[i], 1);
				}
			}
			int i = 0;
			for (; i<a.length; i++){
				if (map.get(a[i]) == 1){
					System.out.println(i);
					break;
				}
			}
			if ( i == a.length ){
				System.out.println("-1");
			}
		}
		cin.close();
	}
}
