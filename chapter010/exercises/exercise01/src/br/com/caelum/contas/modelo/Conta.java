package br.com.caelum.contas.modelo;

/**
 * Classe responsável por moldar as Contas do Banco
 * 
 **/

public abstract class Conta {

	private String titular;
	private String agencia;
	private long numero;
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

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public abstract String getTipo();
	
	public void transfere(double valor, Conta conta) {
	     this.sacar(valor);
	     conta.depositar(valor);
	}
	
	public String recuperaDadosParaImpressao() {
		   String dados = "Titular: " + this.titular;
		   dados += "\nNúmero: " + this.numero;
		   dados += "\nAgência: " + this.agencia;
		   dados += "\nSaldo: R$" + this.saldo;
		   // chamando um método abstrato dentro de um outro método
		   dados += "\nTipo: " + this.getTipo();
		   return dados;
		}
	
}