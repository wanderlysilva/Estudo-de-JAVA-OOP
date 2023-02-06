
public class Conta {

	private double saldo;
	private String titular;
	private int numero;
	private String agencia;
	
	public void deposita(double valor) {
		if(valor > 0)
			this.saldo += valor;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void saca(double valor) {
		if(valor > 0 && valor <= saldo)
			this.saldo -= valor;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
	
}
