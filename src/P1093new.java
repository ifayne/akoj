//AC
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P1093new {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	static class rectangle {
		int No, length, width;
	}

	public static void main(String[] args) {
		int t = cin.nextInt();
		while (t-- > 0) {
			int n = cin.nextInt();
			rectangle rect[] = new rectangle[n];
			for (int i = 0; i < n; i++) {
				rect[i] = new rectangle();
				rect[i].No = cin.nextInt();
				int a = cin.nextInt();
				int b = cin.nextInt();
				rect[i].length = a > b ? a : b;
				rect[i].width = a > b ? b : a;
			}
			Arrays.sort(rect, new Comparator<rectangle>() {

				@Override
				public int compare(rectangle o1, rectangle o2) {
					// TODO Auto-generated method stub
					if (o1.No < o2.No || o1.No == o2.No && o1.length < o2.length
							|| o1.No == o2.No && o1.length == o2.length && o1.width < o2.width)
						return -1;
					return 1;
				}

			});
			System.out.println(rect[0].No + " " + rect[0].length + " " + rect[0].width);
			for (int i = 1; i < n; i++) {
				if (!(rect[i].No == rect[i - 1].No && rect[i].length == rect[i - 1].length
						&& rect[i].width == rect[i - 1].width))
					System.out.println(rect[i].No + " " + rect[i].length + " " + rect[i].width);
			}
		}
		closeIO();
	}

	static void closeIO() {
		// TODO Auto-generated method stub
		if (cin != null)
			cin.close();
		if (cout != null)
			cout.close();
	}
}