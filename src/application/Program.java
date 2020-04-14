package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the order of the matrix: ");
		int n = scanner.nextInt();
		
		int[][] matrix = new int[n][n];
		int negativeNumbers = 0;
		
		System.out.println("Enter the values: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = scanner.nextInt();
				if (matrix[i][j] < 0) {
					negativeNumbers ++;
				}
			}
		}
		System.out.println();
		System.out.println("Main diagonal: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (i == j) {
					System.out.print(matrix[i][j] + " ");
				}
			}
		}
		System.out.println();
		System.out.print("Negative numbers = " + negativeNumbers);
		
		scanner.close();
	}

}
