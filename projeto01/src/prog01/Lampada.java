package prog01;

public class Lampada {
	
	String marca;
	String modelo;
	int quantidade;
	int valor;
	int lumens;
	int potencia;
	
	void mostramarca() {
	System.out.println("A marca da l�mpada � " + marca);}
	
	void mostramodelo() {
		System.out.println("O modelo da l�mpada � " + modelo);}
	
	void mostraquantidade() {
		System.out.println("A quantidade de l�mpadas � " + quantidade);}

	void mostravalor() {
		System.out.println("o valor da l�mpada � " + valor);}
	
	void mostralumens() {
		System.out.println("A l�mpada possui " + lumens);}

	void mostrapotencia() {
		System.out.println("A l�mpada possui " + potencia + " watts de pot�ncia");
		
	}
	
}
