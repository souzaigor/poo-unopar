package prog04;

public class LivroDeBiblioteca {
	
		String nomelivro;
		String categoria;
		String autor;
		String editora;
		short ano;
		int quantidadeemestoque;
		int quantidadeemprestada;
		byte diadeemprestimo;
		byte mesdeemprestimo;
		short anodeemprestimo;
		byte diaderetorno;
		byte mesderetorno;
		short anoderetorno;	
		
		void mostranome(){
			System.out.println("O nome do Livro �: " + nomelivro); }
		
		void mostracategoria(){
			System.out.println("A categoria �: " + categoria); }
		
		void mostraautor(){
			System.out.println("O autor �: " + autor); }
		
		void mostraeditora(){
			System.out.println("A editora �: " + editora); }
		
		void mostraano(){
			System.out.println("O ano �: " + ano); }
		
		void mostraquantidadeemestoque(){
			System.out.println("A quantidade em estoque �: " + quantidadeemestoque); }
		
		void mostraquantidadeemprestada(){
			System.out.println("A quantidade emprestada �: " + quantidadeemprestada); }
		
		void mostradiadeemprestimo(){
			System.out.println("O dia de emprestimo �: " + diadeemprestimo); }
		
		void mostramesdeemprestimo(){
			System.out.println("O m�s de emprestimo �: " + mesdeemprestimo); }
		
		void mostraanodeemprestimo(){
			System.out.println("O ano de emprestimo �: " + anodeemprestimo); }
		
		void mostradiaderetorno(){
			System.out.println("O dia de retorno �: " + diaderetorno); }
		
		void mostramesderetorno(){
			System.out.println("O m�s de retorno �: " + mesderetorno); }
		
		void mostraanoderetorno(){
			System.out.println("O ano de retorno �: " + anoderetorno); }
		
		
}
