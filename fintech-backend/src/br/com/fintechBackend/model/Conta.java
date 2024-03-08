package br.com.fintechBackend.model;

public abstract class Conta {
	
	private Integer numero;
	private Double saldo;
	private Double limite;
	//private List<Transacao> extrato;
	private String banco;
	//private cliente Cliente;
	
	public Conta() {
		
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}
	
}
