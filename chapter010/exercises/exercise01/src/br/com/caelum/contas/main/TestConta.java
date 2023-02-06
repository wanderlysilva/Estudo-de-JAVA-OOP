package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

public class TestConta {

	public static void main(String[] args) {
		Conta conta1 = new ContaCorrente();
		
		conta1.setTitular("Test");
		conta1.setNumero(1234);
		conta1.depositar(200);
		System.out.println("Saldo: " + conta1.getSaldo());
		conta1.sacar(20);
		System.out.println("Saldo: "+ conta1.getSaldo());
		System.out.println(conta1.recuperaDadosParaImpressao() + "\n");
		
		Conta conta2 = new ContaPoupanca();
		conta2.setTitular("Joao");
		conta2.setNumero(123);
		System.out.println(conta2.getSaldo());
		conta2.depositar(300);
		System.out.println(conta2.getSaldo());
		System.out.println(conta2.recuperaDadosParaImpressao());
	}
	
}