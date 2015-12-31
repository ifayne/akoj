import java.util.Scanner;

public class P1155 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext())
		{
			String ip = cin.next();
			if (ip.contains(".")){
				String a[] = ip.split("[.]+");
				for (int i=0; i<a.length; i++){
					System.out.print(Integer.toBinaryString(Integer.valueOf(a[i])));
				}
				System.out.println();
			}else{
				String a[] = new String[4];
				a[0] = ip.substring(0, 8);
				a[1] = ip.substring(8, 16);
				a[2] = ip.substring(16, 24);
				a[3] = ip.substring(24);
				System.out.print(Integer.valueOf(a[0], 2));
				for (int i=1; i<a.length; i++){
					System.out.print("."+Integer.valueOf(a[i], 2));
				}
				System.out.println();
			}
		}
		cin.close();
	}
}
