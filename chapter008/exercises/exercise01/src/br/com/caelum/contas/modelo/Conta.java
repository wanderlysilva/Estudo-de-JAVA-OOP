package br.com.caelum.contas.modelo;

/**
 * Classe responsável por moldar as Contas do Banco
 * 
 **/

public class Conta {

	private String titular;
	private String agencia;
	private int codigo;
	private double saldo;
	
	public void depositar(double valor) {
		if(valor > 0) {
			saldo += valor;
		}
	}
	
	public void sacar(double valor) {
		if(valor > 0 && valor <= saldo) {
			saldo -= valor;
		}
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getSaldo() {
		return saldo;
	}
	
}
