// 		   *
//        **
//       ***
//      ****
//     *****
//     
//    *****
//     ****
//      ***
//       **
//        *
package kk_patterns;

public class Pattern7 {

	public static void main(String[] args) {
		
		int n = 5;
		for(int row = 5; row >= 1; row--) {
			for(int col = 1; col <= n-row; col++) {
				System.out.print(" ");
			}
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	
	}

}
