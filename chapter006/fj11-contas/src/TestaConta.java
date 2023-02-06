
public class TestaConta {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setTitular("Joao");
		conta.setNumero(1234);
		conta.deposita(1000);
		System.out.println("Saldo: " + conta.getSaldo());
		conta.saca(100);
		System.out.println("Saldo: " + conta.getSaldo());
	}
}
