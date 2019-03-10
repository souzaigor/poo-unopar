package atividade1;

public class Testelampada {

	public static void main(String[] args) {
		
		Lampada chamalampada = new Lampada();
		
		
		chamalampada.marca = "Visolux"; 
		chamalampada.modelo = "48LEDLUMENS";
		chamalampada.quantidade = 785;
		chamalampada.valor = (int) 49.45;
		chamalampada.lumens = 6000;
		chamalampada.potência = 9;
		
		System.out.printf("- A marca da lâmpada é " + chamalampada.marca);
		System.out.println(" e o modelo é " + chamalampada.modelo + ".");
		
		System.out.print("- Esse modelo possui " + chamalampada.lumens + " lumens");
		System.out.println(" com potência de " + chamalampada.potência + " watts.");
		
		System.out.print("- Há " + chamalampada.quantidade + " lâmpadas no estoque. ");
		
	}

}