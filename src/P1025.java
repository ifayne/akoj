import java.util.Scanner;
import java.util.TreeMap;

public class P1025 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		TreeMap<String, Integer> map = new TreeMap<>();
		for (int i=0; i<n; i++){
			String string = cin.next().replaceAll("[-]+", "").replaceAll("[ABC]", "2").replaceAll("[DEF]", "3").replaceAll("[GHI]", "4").replaceAll("[JKL]", "5").replaceAll("[MNO]", "6").replaceAll("[PRS]", "7").replaceAll("[TUV]", "8").replaceAll("[WXY]", "9");
			String s1 = string.substring(0, 3);
			String s2 = string.substring(3); 
			string = s1 + '-' + s2;
			if (map.containsKey(string))
				map.put(string, map.get(string)+1);
			else
				map.put(string,1);
		}
		boolean judge = true;
		for (String s: map.keySet()){
			if (map.get(s) != 1)
				System.out.printf("%s %d\n", s, map.get(s));
			else
				judge = false;
		}
		if (judge)
			System.out.println("No duplicates.");
		cin.close();
	}
}
