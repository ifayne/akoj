
import java.util.Scanner;

public class P1264 {
	static class Team{
		String T;
		int score;
		Team(){
			this.score = 0;
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
					if(team[i].T.equals(s1))
						team[i].score += sco1 > sco2 ? 3 : sco1 == sco2 ? 1 : 0;
					if (team[i].T.equals(s2))
						team[i].score += sco1 < sco2 ? 3 : sco1 == sco2 ? 1 : 0;
				}
			}
			for (int i=0; i<4; i++){
				System.out.println(team[i].T + " "+ team[i].score);
			}
 		}
		cin.close();
	}
}
