package prog01;

public class Lampada {
	
	String marca;
	String modelo;
	int quantidade;
	int valor;
	int lumens;
	int potencia;
	
	void mostramarca() {
	System.out.println("A marca da lâmpada é " + marca);}
	
	void mostramodelo() {
		System.out.println("O modelo da lâmpada é " + modelo);}
	
	void mostraquantidade() {
		System.out.println("A quantidade de lâmpadas é " + quantidade);}

	void mostravalor() {
		System.out.println("o valor da lâmpada é " + valor);}
	
	void mostralumens() {
		System.out.println("A lâmpada possui " + lumens);}

	void mostrapotencia() {
		System.out.println("A lâmpada possui " + potencia + " watts de potência");
		
	}
	
}
