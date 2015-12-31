import java.util.Scanner;

public class P1244 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int left = 0, right = 0, max = 1;
			char a[] = cin.next().trim().toCharArray();
			boolean judge = false;
			for (int i=0; i<a.length; i++){
				if (a[i] == '('){
					left++;
				}
				if (a[i] == ')'){
					right++;
				}
				if (left == right){
					if (left > max){
						max = left;
					}
					left = right = 0;
				}
				if ((a[0] != '(' || a[0] == ')') || (a[a.length-1] != ')' || a[a.length-1] == '(')|| 
						a[i] != '(' && a[i] != ')' && (a[i-1] == ')' || a[i+1] == '(')){
					judge = true;
					break;
				}
			}
			if (judge || left != 0 || right != 0){
				System.out.println("Error");
			}else
				System.out.println(max);
		}
		cin.close();
	}
}
