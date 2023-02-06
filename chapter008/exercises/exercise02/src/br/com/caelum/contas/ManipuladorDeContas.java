package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {

	private Conta conta;
	
	public void criaConta(Evento evento) {
		Conta conta = new Conta();
        conta.setAgencia("1234");
        conta.setNumero(56789);
        conta.setTitular("Batman");
	}
	
	public void deposita(Evento evento) {
		double valorDigitado = evento.getDouble("valor");
		this.conta.depositar(valorDigitado);
	}
	
	public void saca(Evento evento) {
		double valorDigitado = evento.getDouble("valor");
		this.conta.sacar(valorDigitado);
	}
}
