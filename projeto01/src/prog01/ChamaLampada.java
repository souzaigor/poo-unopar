package prog01;

public class ChamaLampada {

	public static void main(String[] args) {
		
Lampada lp = new Lampada();
		
		lp.marca = "Visolux"; 
		lp.modelo = "48LEDLUMENS";
		lp.quantidade = 785;
		lp.valor = (int) 49.45;
		lp.lumens = 6000;
		lp.potencia = 9;
		
		lp.mostramarca();
		lp.mostramodelo();
		lp.mostraquantidade();
		lp.mostravalor();
		lp.mostralumens();
		lp.mostrapotencia();	
		
	}

}
