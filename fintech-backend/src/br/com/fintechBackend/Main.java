package br.com.fintechBackend;

import java.util.Scanner;

import br.com.fintechBackend.model.Cliente;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Posteriormente este bloco será gerado através
		// de interação com o usuário.
		Cliente cliente = new Cliente();
		cliente.setNome("Harry Potter");
		cliente.setEmail("harry@hogwarts.com");
		cliente.setCpf("999.999.999-99");

		System.out.println("*********************");
		System.out.println("     FINTECH APP     ");
		System.out.println("[1] - Criar conta    ");
		System.out.println("[2] - Encerrar conta ");
		System.out.println("[3] - Acessar conta  ");
		System.out.println("[4] - Exibir contas  ");
		System.out.println("[0] - Sair           ");
		System.out.println("*********************");
		System.out.println("Escolha: ");
		int opcaoPrincipal = scan.nextInt();
		pularLinha();
		
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
			case 4:
				cliente.exibirContas();
				pularLinha();
				break;
			case 0:
				System.out.println("Sair");
				break;
			default:
			System.out.println("Opção Inválida!");
		}
		
		
		
		scan.close();
	}
	
	public static void pularLinha() {
		System.out.println("");
	}

}
