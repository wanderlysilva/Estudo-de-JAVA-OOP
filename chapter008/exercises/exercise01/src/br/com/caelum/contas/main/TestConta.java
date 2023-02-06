package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;

public class TestConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		
		conta1.setTitular("Test");
		conta1.setCodigo(1234);
		conta1.depositar(200);
		
		System.out.println("Saldo: " + conta1.getSaldo());
		
		conta1.sacar(20);
		
		System.out.println("Saldo: "+ conta1.getSaldo());
	}
	
}
