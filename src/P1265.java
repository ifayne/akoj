
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P1265 {
	static class Team{
		String T;
		int score;
		int count;
		int x;
		Team(){
			this.score = 0;
			this.count = 0;
			x = 0;
		}
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext())
		{
			Team team[] = new Team[4]; 
			
			for (int i=0; i<4; i++){
				team[i] = new Team();
				team[i].T = cin.next();
			}
			int t = cin.nextInt();
			while (t-- > 0){
				String s1 = cin.next();
				String s2 = cin.next();
				int sco1 = cin.nextInt();
				int sco2 = cin.nextInt();
				for (int i=0; i<4; i++){
					if(team[i].T.equals(s1)){
						int cnt = sco1 > sco2 ? 3 : sco1 == sco2 ? 1 : 0;
						team[i].score += cnt;
						team[i].count += cnt == 3 ? sco1 : 0;
						team[i].x += sco1;
					}
					if (team[i].T.equals(s2)){
						int cnt = sco1 < sco2 ? 3 : sco1 == sco2 ? 1 : 0;
						team[i].score += cnt;
						team[i].count += cnt == 3 ? sco2 : 0;
						team[i].x += sco2;
					}
				}
			}
			Arrays.sort(team, new Comparator<Team>() {

				@Override
				public int compare(Team o1, Team o2) {
					if (o1.score > o2.score || o1.score == o2.score && o1.count > o2.count || o1.score == o2.score && o1.count == o2.count && o1.x > o2.x)
						return -1;
					return 1;
				}
			});
			System.out.println(team[0].T+" "+team[1].T);
 		}
		cin.close();
	}
}
