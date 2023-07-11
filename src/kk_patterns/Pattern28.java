package kk_patterns;

public class Pattern28 {

	public static void main(String[] args) {
		
		int n = 5;
		for(int row = 0; row < n*2; row++) {
			int totalColsInARow = row > n ? n * 2 - row : row;
			int noOfSpace = n - totalColsInARow;
			for(int s = 0; s < noOfSpace; s++) {
				System.out.print(" ");
			}
			for(int col = 0; col < totalColsInARow; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("====================================");
		
		for(int row = 1; row < n*2; row++) {
			int totalColsInARow = row > n ? n * 2 - row : row;
			int noOfSpace = n - totalColsInARow;
			for(int s = 1; s <= noOfSpace; s++) {
				System.out.print(" ");
			}
			for(int col = 1; col <= totalColsInARow; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
