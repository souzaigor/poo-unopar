package prog05;

public class ContaCorrente {

	String proprietario;
	int numero;
	int agencia;
	int saldo;
	int limite;
	
	void mostraproprietario() {
		System.out.println("O propriet�rio da conta �: " + proprietario);}
	
	void mostranumero() {
		System.out.println("N�mero da conta: " + numero); }
	
	void mostraagencia() {
		System.out.println("A ag�ncia �: " + agencia); }
	
	void mostrasaldo() {
		System.out.println("O saldo da conta �: " + saldo); }
	
	void mostralimite() {
		System.out.println("O limite da conta �: " + limite); }
}
