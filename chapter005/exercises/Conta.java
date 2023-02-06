public class Conta {
	private int identificador;
	private static int totalDeContas;
	private String nome;
	private int numero;
	private String agencia;
	private double saldo;
	private Date dataDeAbertura = new Date();

	Conta() {
		Conta.totalDeContas += 1;
		identificador = totalDeContas;	
	}

	Conta(String titular) {
		this();
		this.nome = titular;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getAgencia() {
		return agencia;
	}

	public void saca(double valor) {
		if(valor >= saldo) 
			saldo -= valor;
	}

	public void deposita(double valor) {
		if(valor > 0)
			saldo += valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setDataDeAbertura(int dia, int mes, int ano) {
		if(!((dia >= 1 && dia <= 31) && (mes >= 1 && mes <= 12) && ano > 0))
			return;
		if((mes == 2 && dia > 29))
			return;

		dataDeAbertura.dia = dia;
		dataDeAbertura.mes = mes;
		dataDeAbertura.ano = ano;
	}

	public String getDataDeAbertura() {
		return dataDeAbertura.formatada();
	}


	public double getRendimento() {
		return saldo * 0.1;	
	}

	public String recuperaDadosParaImpressao() {
		return "Nome: " + nome +
			   "\nNumero: " + numero + 
			   "\nAgencia: " + agencia + 
			   "\nSaldo: " + saldo + 
			   "\nData de abertura: " + dataDeAbertura.formatada();
	}

}
