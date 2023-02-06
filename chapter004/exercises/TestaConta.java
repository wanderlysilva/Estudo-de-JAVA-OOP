public class TestaConta {
	public static void main(String[] args) {
		Conta c1 = new Conta();

		c1.nome = "Hugo";
		c1.numero = 123;
		c1.agencia = "45678-9";
		c1.saldo = 50.0;
		c1.dataDeAbertura.dia = 04;
		c1.dataDeAbertura.mes = 06;
		c1.dataDeAbertura.ano = 2015;

		c1.deposita(100.0);
		System.out.println("saldo atual: " + c1.saldo);
		System.out.println("Rendimento mensal: " + c1.calculaRendimento());

		//System.out.println(c1.recuperaDadosParaImpressao());
		System.out.println(c1);

		// Testando objetos
		Conta c2 = new Conta();
		c2.nome = "Danilo";
		c2.saldo = 100;

		Conta c3 = new Conta();
		c3.nome = "Danilo";
		c3.saldo = 100;

		// Como cada variável se refere a um objeto diferente
		// retornará falso
		if(c2 == c3)
			System.out.println("Iguais");
		else
			System.out.println("Diferentes");

		Conta c4 = new Conta();
		c4.nome = "Hugo";
		c4.saldo = 100;

		Conta c5 = c4; // c5 se refere ao mesmo objeto que c4
		
		System.out.println(c4 == c5);

	}
}
