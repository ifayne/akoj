
import java.util.*;


public class P1083 {
	@SuppressWarnings("rawtypes")
	static class Kao implements Comparable{
		String name;
		double ying, zheng, shu, zhuan, fushi;

		Kao(String name, double ying, double zheng, double shu, double zhuan, double fushi) {
			this.name = name;
			this.ying = ying;
			this.zheng = zheng;
			this.shu = shu;
			this.zhuan = zhuan;
			this.fushi = fushi;
		}

		double sum() {
			return this.ying + this.zheng + this.shu + this.zhuan;
		}

		double tatal() {
			return sum() * 0.6 + fushi * 0.4;
		}
		boolean luqu(){
			if (fushi < 60)
				return false;
			return true;
		}
		@Override
		public int compareTo(Object o) {
			Kao e2 = (Kao)o;
			Kao e1 = this;
			if (e1.tatal() > e2.tatal() || e1.tatal() == e2.tatal() && e1.name.compareTo(e2.name) < 0)
				return -1;
			return 1;
		}
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		List<Kao> list = new LinkedList<Kao>();
		double x = cin.nextDouble(), y = cin.nextDouble(), z = cin.nextDouble(), d = cin.nextDouble(), e = cin.nextDouble();
		while (cin.hasNext()) {
			String name = cin.next();
			double shu = cin.nextDouble();
			double ying = cin.nextDouble();
			double zheng = cin.nextDouble();
			double zhuan = cin.nextDouble();
			double fushi = cin.nextDouble();
			if (shu >= x && ying >= y && zheng >= z && zhuan >= d && (shu + ying + zheng + zhuan) >= e 
					&& fushi >= 60)
				list.add(new Kao(name, ying, zheng, shu, zhuan, fushi));
		}
		Collections.sort(list);
		Iterator<Kao> iterator = list.iterator();
		int count = 0;
		while (iterator.hasNext()){
			Kao stu = iterator.next();
			System.out.printf("%s %.0f %.0f %.1f %d\n", stu.name, stu.sum(), stu.fushi,  stu.tatal(), ++count);
		}
		
		
		cin.close();
	}
}
