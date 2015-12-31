import java.util.Scanner;

public class P1319 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt(), p = 0;
			for (int i = 0; i <= 100; i++) {
				for (int j = 0; j <= 100; j++) {
					for (int k = 0; k <= 100; k++) {
						for (int z = 0; z <= 100; z++) {
							if (i * i + j * j + k * k + z * z == n) {
								System.out.println(i + " " + j + " " + k + " " + z);
								p = 1;
								break;
							}
						}
						if (p == 1)
							break;
					}
					if (p == 1)
						break;
				}
				if (p == 1)
					break;
			}
		}
		cin.close();
	}

}
