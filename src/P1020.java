import java.util.Scanner;


public class P1020 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int t = cin.nextInt();
			while (t-- > 0) {
				String line = cin.next();
				char a[] = line.toCharArray();
				String sNum[] = new String[a.length+1], str = null;
				long lNum[] = new long[a.length+1];
				
				lNum[0] = a[0] - '0';
				long tmp = 0;
				int count = 0, begin = 1;
				boolean judge = false;
				for (int i=1; i<a.length; i++){
					tmp = tmp * 10 + a[i] - '0';
					if (tmp > lNum[count]){
						int end = i;
						lNum[++count] = tmp;
						sNum[count] = line.substring(begin, end+1);
						begin = i+1;
						tmp = 0;
					}if (tmp <= lNum[count]){
						if (tmp < lNum[count] && i == a.length - 1){
							sNum[count] = sNum[count] + line.substring(begin);
						}else if (tmp == lNum[count]  && i == a.length - 1){
							sNum[count] = sNum[count] + line.substring(begin);
						}
					}

				}
				System.out.print(a[0]);
				for (int i=1; i<count+1; i++){
					System.out.print(","+sNum[i]);
				}
				System.out.println();
			}
		}
		cin.close();
	}
}
