package prog02;

public class ChamaLivro {

	public static void main(String[] args) {
		
		Livro lv = new Livro();
		
		lv.nomelivro = "BOLOLO";
		lv.autor = "JOAOZIN";
		lv.editora = "ABRIL";
		lv.ano = 1995;
		
		lv.mostranome();
		lv.mostraautor();
		lv.mostraeditora();
		lv.mostraano();

	}

}