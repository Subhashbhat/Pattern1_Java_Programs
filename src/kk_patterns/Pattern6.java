//	  *
//   **
//  ***
// ****
//*****
package kk_patterns;

public class Pattern6 {

	public static void main(String[] args) {
		
		int n = 5;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for(int k = 5; k <= n - 1 + i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
