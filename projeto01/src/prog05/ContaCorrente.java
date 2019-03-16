package prog05;

public class ContaCorrente {

	String proprietario;
	int numero;
	int agencia;
	int saldo;
	int limite;
	
	void mostraproprietario() {
		System.out.println("O proprietário da conta é: " + proprietario);}
	
	void mostranumero() {
		System.out.println("Número da conta: " + numero); }
	
	void mostraagencia() {
		System.out.println("A agência é: " + agencia); }
	
	void mostrasaldo() {
		System.out.println("O saldo da conta é: " + saldo); }
	
	void mostralimite() {
		System.out.println("O limite da conta é: " + limite); }
}
