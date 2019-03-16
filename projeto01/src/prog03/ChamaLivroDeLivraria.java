package prog03;

public class ChamaLivroDeLivraria {

	public static void main(String[] args) {
		
		LivroDeLivraria lvl = new LivroDeLivraria();
		
		lvl.nomelivro = "CARARAIO";
		lvl.categoria = "AÇÃO";
		lvl.autor = "AIRTON";
		lvl.editora = "ABRIL";
		lvl.ano = 2000;
		lvl.quantidade = 789521;
		lvl.preco = 15.69;
		
		lvl.mostranomelivro();
		lvl.mostracategoria();
		lvl.mostraautor();
		lvl.mostraeditora();
		lvl.mostraano();
		lvl.mostraquantidade();
		lvl.mostrapreco();
		
		
		
	}

}
