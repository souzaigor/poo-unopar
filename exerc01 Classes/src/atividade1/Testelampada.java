package atividade1;

public class Testelampada {

	public static void main(String[] args) {
		
		Lampada chamalampada = new Lampada();
		
		
		chamalampada.marca = "Visolux"; 
		chamalampada.modelo = "48LEDLUMENS";
		chamalampada.quantidade = 785;
		chamalampada.valor = (int) 49.45;
		chamalampada.lumens = 6000;
		chamalampada.pot�ncia = 9;
		
		System.out.printf("- A marca da l�mpada � " + chamalampada.marca);
		System.out.println(" e o modelo � " + chamalampada.modelo + ".");
		
		System.out.print("- Esse modelo possui " + chamalampada.lumens + " lumens");
		System.out.println(" com pot�ncia de " + chamalampada.pot�ncia + " watts.");
		
		System.out.print("- H� " + chamalampada.quantidade + " l�mpadas no estoque. ");
		
	}

}