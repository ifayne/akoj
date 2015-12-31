import java.util.HashMap;
import java.util.Scanner;

public class P1015{
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();

		while (cin.hasNext()) {
			String line = cin.nextLine().trim();
			if (!line.equals("%%%")){
				String a[] = line.split("\\s+");
				map.put(a[0], Integer.valueOf(a[2]));
			}else break;
		}
		while (cin.hasNext()){
			String a[] = cin.nextLine().trim().split("\\s+");
			int num[] = new int[a.length];
			for (int i=0; i<a.length; i++)
				num[i] = 0;
			int sum = 0, count = 0;
			num[count] = map.get(a[0]);
			for (int i=2; i<a.length; i+=2){
				if (a[i-1].equals("+"))
					num[++count] = map.get(a[i]);
				if (a[i-1].equals("-"))
					num[++count] = -map.get(a[i]);
				if (a[i-1].equals("*"))
					num[count] *= map.get(a[i]);
			}
			for (int i=0; i<a.length; i++){
				sum += num[i];
			}
			System.out.println(sum);
		}
		cin.close();
	}
}