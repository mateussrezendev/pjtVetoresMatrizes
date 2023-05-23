package pctExercicio3;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		int som = 0;
		int[] valores = new int[5];

		System.out.println("Digite o primeiro valor: ");
		valores[0] = ent.nextInt();

		System.out.println("Digite o segundo valor: ");
		valores[1] = ent.nextInt();

		System.out.println("Digite o terceiro valor: ");
		valores[2] = ent.nextInt();

		System.out.println("Digite o quarto valor: ");
		valores[3] = ent.nextInt();

		System.out.println("Digite o quinto valor: ");
		valores[4] = ent.nextInt();

		for (int i = 0; i < valores.length; i++) {
			som += valores[i];
		}

		double media = som / (double) valores.length;

		System.out.println("A som destes valores é igual a " + som + ".");
		System.out.println("A média destes valores é igual a " + media + ".");
		System.out.println("Os valores maiores que a média são: ");

		for (int i = 0; i < valores.length; i++) {
			if (valores[i] > media) {
				System.out.println(valores[i]);
			}
		}

		System.out.println("Os valores menores que a média são: ");

		for (int i = 0; i < valores.length; i++) {
			if (valores[i] < media) {
				System.out.println(valores[i]);
			}
		}

		ent.close();
	}

}
