import java.util.Scanner;
import java.util.Stack;

public class P1029 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int t = cin.nextInt();
			while (t-- > 0) {
				Stack<Character> stack = new Stack<Character>();
				char a[] = cin.next().toCharArray();
				for (int i=0; i<a.length; i++){
					if (a[i] == '(' || a[i] == '['){
						stack.push(a[i]);
					}else if (!stack.isEmpty()){
						if (op(a[i]) == stack.lastElement())
							stack.pop();
						else {
							System.out.println("No");
							break;
						}
					}else if (stack.empty() && (a[i] == ']' || a[i] == ')')){
						System.out.println("No");
					}
					if ( i == a.length - 1){
						System.out.println("Yes");
					}
				}
			}
		}
		cin.close();
	}

	private static Character op(char c) {
		if (c == ']')
			return '[';
		if (c == ')')
			return '(';
		return null;
	}
}
