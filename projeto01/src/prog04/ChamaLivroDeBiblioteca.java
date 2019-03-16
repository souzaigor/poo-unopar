package prog04;

public class ChamaLivroDeBiblioteca {

	public static void main(String[] args) {

		LivroDeBiblioteca ldb = new LivroDeBiblioteca();
		
		ldb.nomelivro = "CARARAIO";
		ldb.categoria = "AÇÃO";
		ldb.autor = "AIRTON";
		ldb.editora = "ABRIL";
		ldb.ano = 2000;
		ldb.quantidadeemestoque = 45;
		ldb.quantidadeemprestada = 5;
		ldb.diadeemprestimo = 14;
		ldb.mesdeemprestimo = 2;
		ldb.anodeemprestimo = 2003;
		ldb.diaderetorno = 16;
		ldb.mesderetorno = 3;
		ldb.anoderetorno = 2003;	
		
		ldb.mostranome();
		ldb.mostracategoria();
		ldb.mostraautor();
		ldb.mostraeditora();
		ldb.mostraano();
		ldb.mostraquantidadeemestoque();
		ldb.mostraquantidadeemprestada();
		ldb.mostradiadeemprestimo();
		ldb.mostradiaderetorno();
		ldb.mostramesdeemprestimo();
		ldb.mostramesderetorno();
		ldb.mostraanodeemprestimo();
		ldb.mostraanoderetorno();
		

	}

}
