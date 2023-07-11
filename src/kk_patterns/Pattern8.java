//     *
//    ***
//   *****
//  *******
// *********
package kk_patterns;

public class Pattern8 {

	public static void main(String[] args) {

		method1(5);
		System.out.println("---------------------------------");
		method2(5);
		System.out.println("---------------------------------");
		method3(5);
	}

	public static void method1(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 2; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void method2(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void method3(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j < 2 * i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
