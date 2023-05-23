package pctExercicio6;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		int soma = 0, coluna1 = 0, coluna2 = 0, coluna3 = 0, coluna4 = 0, coluna5 = 0, linha1 = 0, linha2 = 0,
				linha3 = 0, linha4 = 0, linha5 = 0;
		int[][] matriz = new int[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("Insira um valor para a linha " + i + ", coluna " + j + ":");
				matriz[i][j] = ent.nextInt();
				;
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("| " + matriz[i][j] + " ");
				if (matriz[i][j] % 2 != 0) {
					soma += matriz[i][j];
				}
			}
			System.out.print("|");
			System.out.println();
		}
		coluna1 = matriz[0][0] + matriz[1][0] + matriz[2][0] + matriz[3][0] + matriz[4][0];
		coluna2 = matriz[0][1] + matriz[1][1] + matriz[2][1] + matriz[3][1] + matriz[4][1];
		coluna3 = matriz[0][2] + matriz[1][2] + matriz[2][2] + matriz[3][2] + matriz[4][2];
		coluna4 = matriz[0][3] + matriz[1][3] + matriz[2][3] + matriz[3][3] + matriz[4][3];
		coluna5 = matriz[0][4] + matriz[1][4] + matriz[2][4] + matriz[3][4] + matriz[4][4];

		linha1 = matriz[0][0] + matriz[0][1] + matriz[0][2] + matriz[0][3] + matriz[0][4];
		linha2 = matriz[1][0] + matriz[1][1] + matriz[1][2] + matriz[1][3] + matriz[1][4];
		linha3 = matriz[2][0] + matriz[2][1] + matriz[2][2] + matriz[2][3] + matriz[2][4];
		linha4 = matriz[3][0] + matriz[3][1] + matriz[3][2] + matriz[3][3] + matriz[3][4];
		linha5 = matriz[4][0] + matriz[4][1] + matriz[4][2] + matriz[4][3] + matriz[4][4];

		System.out.println(" ");
		System.out.println("A soma dos números ímpares fornecidos é " + soma + ".");
		System.out.println(" ");
		System.out.println("A soma dos valores da coluna 1 é " + coluna1 + ".");
		System.out.println("A soma dos valores da coluna 2 é " + coluna2 + ".");
		System.out.println("A soma dos valores da coluna 3 é " + coluna3 + ".");
		System.out.println("A soma dos valores da coluna 4 é " + coluna4 + ".");
		System.out.println("A soma dos valores da coluna 5 é " + coluna5 + ".");
		System.out.println(" ");
		System.out.println("A soma dos valores da linha 1 é " + linha1 + ".");
		System.out.println("A soma dos valores da linha 2 é " + linha2 + ".");
		System.out.println("A soma dos valores da linha 3 é " + linha3 + ".");
		System.out.println("A soma dos valores da linha 4 é " + linha4 + ".");
		System.out.println("A soma dos valores da linha 5 é " + linha5 + ".");
		ent.close();
	}

}
