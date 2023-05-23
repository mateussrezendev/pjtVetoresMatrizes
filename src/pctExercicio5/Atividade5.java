package pctExercicio5;

public class Atividade5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] matriz = new char[5][5];
		int[][] matriz2 = new int[3][4];
		double[][] matriz3 = new double[3][4];

		matriz[0][0] = 'a';
		matriz[0][1] = 'b';
		matriz[0][2] = 'c';
		matriz[0][3] = 'd';
		matriz[0][4] = 'e';
		matriz[1][0] = 'f';
		matriz[1][1] = 'g';
		matriz[1][2] = 'h';
		matriz[1][3] = 'i';
		matriz[1][4] = 'j';
		matriz[2][0] = 'l';
		matriz[2][1] = 'm';
		matriz[2][2] = 'n';
		matriz[2][3] = 'o';
		matriz[2][4] = 'p';
		matriz[3][0] = 'q';
		matriz[3][1] = 'r';
		matriz[3][2] = 's';
		matriz[3][3] = 't';
		matriz[3][4] = 'u';

		for (char i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				System.out.print(matriz[i][j] + "   ");
			}
			System.out.println();
		}

		matriz2[0][0] = 19;
		matriz2[0][1] = 25;
		matriz2[0][2] = 100;
		matriz2[0][3] = 99;
		matriz2[1][0] = 10;
		matriz2[1][1] = 7;
		matriz2[1][2] = 25;
		matriz2[1][3] = 14;
		matriz2[2][0] = 35;
		matriz2[2][1] = 2;
		matriz2[2][2] = 47;
		matriz2[2][3] = 74;

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 4; j++) {
				System.out.print(matriz2[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println(" ");
		matriz3[0][0] = 1.9;
		matriz3[0][1] = 2.5;
		matriz3[0][2] = 10.0;
		matriz3[1][0] = 1.0;
		matriz3[1][1] = 7.8;
		matriz3[1][2] = 2.5;
		matriz3[2][0] = 3.5;
		matriz3[2][1] = 2.2;
		matriz3[2][2] = 4.7;

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				System.out.print(matriz3[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
