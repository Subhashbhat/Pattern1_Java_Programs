//*
//**
//***
//****
//*****
//****
//***
//**
//*
package kk_patterns;

public class Pattern5 {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				for (int j = 1; j <= i; j++) {
					System.out.print("* ");
				}
				System.out.println();
			} else {
				// if (i >= 6 && i <= 9) {
				for (int j = 1; j <= 10 - i; j++) {
					System.out.print("* ");
				}
				System.out.println();
				// }
			}
		}

		System.out.println("---------------++------------------");

		int n = 10;
		for (int i = 1; i < n; i++) {
			int totalNumOfColumns = i > 5 ? n - i : i;
			for (int j = 1; j <= totalNumOfColumns; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-----------------==----------------");

		int m = 5;
		for (int i = 1; i < n; i++) {
			int totalNumOfColumn = i > m ? m * 2 - i : i;
			for (int j = 1; j <= totalNumOfColumn; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
