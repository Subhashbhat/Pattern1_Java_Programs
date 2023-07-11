//		   1
//        212
//       32123
//      4321234
//       32123
//        212
//         1
package kk_patterns;

public class Pattern17 {

	public static void main(String[] args) {
		
		int n = 4;
		for(int i = 1; i < 2 * n; i++) {
			int c = i >= n? n*2-i : i;
			for(int space = 1; space <= n - c; space++) {
				System.out.print(" ");
			}
			for(int j = c; j >= 1; j--) {
				System.out.print(j);
			}
			for(int j = 2; j <= c; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
