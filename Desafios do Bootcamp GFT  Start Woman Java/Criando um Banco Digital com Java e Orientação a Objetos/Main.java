public class Main {

	public static void main(String[] args) {
		Cliente müller = new Cliente();
		venilton.setNome("Müller");
		
		Conta cc = new ContaCorrente(müller);
		Conta poupanca = new ContaPoupanca(müller);

		cc.depositar(70);
		cc.transferir(70, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
