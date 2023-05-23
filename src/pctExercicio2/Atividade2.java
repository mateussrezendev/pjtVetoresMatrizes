package pctExercicio2;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);

		String[][] clientes = new String[3][4];

		clientes[0][0] = "João";
		clientes[0][1] = "Rua das Flores, 123";
		clientes[1][0] = "Maria";
		clientes[1][1] = "Avenida dos Anjos, 456";
		clientes[2][0] = "Pedro";
		clientes[2][1] = "Praça da Liberdade, 789";

		System.out.println("João qual seu Telefone?");
		clientes[0][2] = ent.next();

		System.out.println("João qual seu CPF?");
		clientes[0][3] = ent.next();

		System.out.println("Maria qual seu Telefone?");
		clientes[1][2] = ent.next();

		System.out.println("Maria qual seu CPF?");
		clientes[1][3] = ent.next();

		System.out.println("Pedro qual seu Telefone?");
		clientes[2][2] = ent.next();

		System.out.println("Pedro qual seu CPF?");
		clientes[2][3] = ent.next();

		for (int i = 0; i < 3; i++) {
			System.out.println("Nome: " + clientes[i][0]);
			System.out.println("Endereço: " + clientes[i][1]);
			System.out.println("Telefone: " + clientes[i][2]);
			System.out.println("CPF: " + clientes[i][3]);
			System.out.println();
		}
		ent.close();
	}

}
