package br.com.fintechBackend;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("*********************");
		System.out.println("     FINTECH APP     ");
		System.out.println("[1] - Criar conta    ");
		System.out.println("[2] - Encerrar conta ");
		System.out.println("[3] - Acessar conta  ");
		System.out.println("[0] - Sair           ");
		System.out.println("*********************");
		System.out.println("Escolha: ");
		int opcaoPrincipal = scan.nextInt();
		
		switch (opcaoPrincipal) {
		case 1:
			System.out.println("Criar");
			break;
		case 2:
			System.out.println("Encerrar");
			break;
		case 3:
			System.out.println("Acessar");
			break;
		case 0:
			System.out.println("Sair");
			break;
		default:
			System.out.println("Opção Inválida!");
		}
		
		
		
		scan.close();
	}

}
