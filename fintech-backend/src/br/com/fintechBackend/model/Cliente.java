package br.com.fintechBackend.model;

import java.util.List;

public class Cliente {
	
	private String nome;
	private String email;
	private String cpf;
	private List<Conta> contas;
	
	public Cliente() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	
	public void criarConta() {
		
	}
	
	public void encerrarConta() {
		
	}
	
	public void exibirContas() {
		if (this.contas != null && this.contas.size() > 0) {
			System.out.println(" - Contas disponíveis - ");
			for (Conta conta : this.contas) {
				System.out.println("Banco: " + conta.getBanco());
				System.out.println("Número: " + conta.getNumero());
				System.out.println("Saldo: " + conta.getSaldo());
			}
		} else {
			System.out.println("Sem contas disponíveis no momento.");
		}
	}

}
