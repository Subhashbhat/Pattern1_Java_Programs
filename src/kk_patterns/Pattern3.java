//*****
//****
//***
//**
//*
package kk_patterns;

public class Pattern3 {

	public static void main(String[] args) {
		
		for(int i = 5; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		
		//method 2
		int n = 5;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
