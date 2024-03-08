package br.com.fintechBackend.model;

public class Transacao {
	
	private int tipo;
	private Conta contaDe;
	private Conta contaPara;
	private Double valor;
	
	public Transacao() {
		
	}

	public Transacao(int tipo, Conta contaDe, Conta contaPara, Double valor) {
		this.tipo = tipo;
		this.contaDe = contaDe;
		this.contaPara = contaPara;
		this.valor = valor;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public Conta getContaDe() {
		return contaDe;
	}

	public void setContaDe(Conta contaDe) {
		this.contaDe = contaDe;
	}

	public Conta getContaPara() {
		return contaPara;
	}

	public void setContaPara(Conta contaPara) {
		this.contaPara = contaPara;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	public boolean efetuarTransacao() {
		return false;
	}

}
