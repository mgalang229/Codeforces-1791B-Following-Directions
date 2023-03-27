import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt();
			char[] s = fs.next().toCharArray();
			int x = 0, y = 0;
			boolean passed = false;
			for (char dir : s) {
				if (dir == 'R') {
					x++;
				}
				if (dir == 'L') {
					x--;
				}
				if (dir == 'U') {
					y++;
				}
				if (dir == 'D') {
					y--;
				}
				if (x == 1 && y == 1) {
					passed = true;
					break;
				}
			}
			System.out.println(passed ? "YES" : "NO");
		}
		fs.close();
	}
}
