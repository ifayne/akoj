import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P1146 {
	static class Student{
		String name;
		int year, month, day;
	}
	public static void main(String[] args) {
		int n = cin.nextInt();
		Student stu[] = new Student[n];
		for (int i=0; i<n; i++){
			stu[i] = new Student();
			stu[i].name = cin.next();
			stu[i].year = cin.nextInt();
			stu[i].month = cin.nextInt();
			stu[i].day = cin.nextInt();
		}
		Arrays.sort(stu, new Comparator<Student>(){

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				if (o1.year < o2.year || o1.year == o2.year && o1.month < o2.month || o1.year == o2.year && o1.month == o2.month && o1.day < o2.day)
					return -1;
				return 1;
			}
			
		});
		for (int i=0; i<n; i++){
			cout.println(stu[i].name);
		}
		closeIO();
	}
	static void closeIO() {
		// TODO Auto-generated method stub
		if (cin != null) cin.close();
		if (cout != null) cout.close();
	}
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
}
