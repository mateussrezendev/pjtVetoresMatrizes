package pctExercicio1;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		int[][] matriz = new int[3][3];

		System.out.println("Insira um valor para a coluna 1, linha 1:");
		matriz[0][0] = ent.nextInt();

		System.out.println("Insira um valor para a coluna 1, linha 2:");
		matriz[0][1] = ent.nextInt();

		System.out.println("Insira um valor para a coluna 1, linha 3:");
		matriz[0][2] = ent.nextInt();

		System.out.println("Insira um valor para a coluna 2, linha 1:");
		matriz[1][0] = ent.nextInt();

		System.out.println("Insira um valor para a coluna 2, linha 2:");
		matriz[1][1] = ent.nextInt();

		System.out.println("Insira um valor para a coluna 2, linha 3:");
		matriz[1][2] = ent.nextInt();

		System.out.println("Insira um valor para a coluna 3, linha 1:");
		matriz[2][0] = ent.nextInt();

		System.out.println("Insira um valor para a coluna 3, linha 2:");
		matriz[2][1] = ent.nextInt();

		System.out.println("Insira um valor para a coluna 3, linha 3");
		matriz[2][2] = ent.nextInt();

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				System.out.print("| " + matriz[i][j] + " ");
			}
			System.out.print("|");
			System.out.println();
		}
		ent.close();
	}

}
