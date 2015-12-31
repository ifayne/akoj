
import java.util.Scanner;

public class P1087 {
	static class Point {
		int x, y;
		Point(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext())
		{
			int n = cin.nextInt();
			Point point[] = new Point[n];
			for (int i=0; i<n; i++){
				point[i] = new Point(cin.nextInt(), cin.nextInt());
			}
			int count = 1, max = 1;
			for (int i=0; i<n; i++){
				count = 1;
				for (int a=i, b = i+1; b<n; ){
					if (point[a].y <= point[b].x){
						count++;
						a++;
						b++;
					}else {
						b++;
					}
				}
				if (count > max)
					max = count;
			}
			System.out.println(max);
		}
		cin.close();
	}
}
