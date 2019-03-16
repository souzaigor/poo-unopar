package prog05;

public class ChamaContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		
		cc.proprietario = ("HUGO");
		cc.numero = 55842;
		cc.agencia = 7878;
		cc.saldo = 578000003;
		cc.limite = 980000004;
	
		cc.mostraproprietario();
		cc.mostranumero();
		cc.mostraagencia();
		cc.mostrasaldo();
		cc.mostralimite();

	}

}
