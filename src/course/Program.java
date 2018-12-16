package course;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		for (int i = 0; i < mat.length; i++) { // linha
			for (int j = 0; j < mat[i].length; j++) { // coluna
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Main diagonal:");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");

		}
		int contNegativo = 0;
		for (int i = 0; i < mat.length; i++) { // linha
			for (int j = 0; j < mat[i].length; j++) { // coluna
				if (mat[i][j] < 0) {
					contNegativo++;
				}
			}
		}

		System.out.println();
		System.out.printf("Negative numbers = %d", contNegativo);

		sc.close();

	}

}
