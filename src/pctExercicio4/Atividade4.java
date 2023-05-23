package pctExercicio4;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		double[] vetor = new double[10];

		System.out.println("Digite o primeiro valor: ");
		vetor[0] = ent.nextDouble();

		System.out.println("Digite o segundo valor: ");
		vetor[1] = ent.nextDouble();

		System.out.println("Digite o terceiro valor: ");
		vetor[2] = ent.nextDouble();

		System.out.println("Digite o quarto valor: ");
		vetor[3] = ent.nextDouble();

		System.out.println("Digite o quinto valor: ");
		vetor[4] = ent.nextDouble();

		System.out.println("Digite o sexto valor: ");
		vetor[5] = ent.nextDouble();

		System.out.println("Digite o sétimo valor: ");
		vetor[6] = ent.nextDouble();

		System.out.println("Digite o oitavo valor: ");
		vetor[7] = ent.nextDouble();

		System.out.println("Digite o nono valor: ");
		vetor[8] = ent.nextDouble();

		System.out.println("Digite o décimo valor: ");
		vetor[9] = ent.nextDouble();

		System.out.println(" ");
		System.out.print(vetor[9] + ", ");
		System.out.print(vetor[8] + ", ");
		System.out.print(vetor[7] + ", ");
		System.out.print(vetor[6] + ", ");
		System.out.print(vetor[5] + ", ");
		System.out.print(vetor[4] + ", ");
		System.out.print(vetor[3] + ", ");
		System.out.print(vetor[2] + ", ");
		System.out.print(vetor[1] + ", ");
		System.out.print(vetor[0] + ".");

		ent.close();
	}

}
