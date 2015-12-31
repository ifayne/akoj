import java.util.Scanner;
import java.util.*;

public class P1093 {
	public static void main(String[] args) {
		List<rectangle> list = new LinkedList<rectangle>();
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0) {
			int n = cin.nextInt();
			rectangle rect[] = new rectangle[n];
			for (int i = 0; i < n; i++) {
				int no = cin.nextInt();
				int a = cin.nextInt();
				int b = cin.nextInt();
				if (a < b) {
					int temp = a;
					a = b;
					b = temp;
				}
				list.add(new rectangle(no, a, b));
			}
		}
		Collections.sort(list);
		Iterator it = list.iterator();
		while (it.hasNext()) {
			rectangle r = (rectangle) it.next();
			System.out.println("number:" + r.NO + "Length" + r.length + "Width" + r.width);
		}
		/*
		 * Scanner cin = new Scanner(System.in); int t = cin.nextInt(); while
		 * (t-- > 0) { int n = cin.nextInt(); rectangle rect[] = new
		 * rectangle[n]; for (int i = 0; i < n; i++) { rect[i].NO =
		 * cin.nextInt(); int a = cin.nextInt(); int b = cin.nextInt(); if (a <
		 * b) { int temp = a; a = b; b = temp; } rect[i].length = a;
		 * rect[i].width = b; } for (int i = 0; i < n; i++) {
		 * System.out.println(rect[i].NO + " " + rect[i].length + " " +
		 * rect[i].width); } } cin.close();
		 */
	}
}

class rectangle implements Comparable {
	int NO;
	int length;
	int width;

	rectangle(int NO, int length, int width) {
		this.NO = NO;
		this.length = length;
		this.width = width;
	}

	public int compareTo(Object o) {
		rectangle r = (rectangle) o;
		if (this.NO < r.NO || this.length == r.length && this.length < r.length
				|| this.NO == r.NO && this.length == r.length && this.width < r.width) {
			return -1;
		}
		return 1;
		// if ( this.NO < r.length || this.NO == r.NO && this.length < r.length
		// || )
	}
}
