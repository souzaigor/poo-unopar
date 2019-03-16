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
			System.out.println("O nome do Livro é: " + nomelivro); }
		
		void mostracategoria(){
			System.out.println("A categoria é: " + categoria); }
		
		void mostraautor(){
			System.out.println("O autor é: " + autor); }
		
		void mostraeditora(){
			System.out.println("A editora é: " + editora); }
		
		void mostraano(){
			System.out.println("O ano é: " + ano); }
		
		void mostraquantidadeemestoque(){
			System.out.println("A quantidade em estoque é: " + quantidadeemestoque); }
		
		void mostraquantidadeemprestada(){
			System.out.println("A quantidade emprestada é: " + quantidadeemprestada); }
		
		void mostradiadeemprestimo(){
			System.out.println("O dia de emprestimo é: " + diadeemprestimo); }
		
		void mostramesdeemprestimo(){
			System.out.println("O mês de emprestimo é: " + mesdeemprestimo); }
		
		void mostraanodeemprestimo(){
			System.out.println("O ano de emprestimo é: " + anodeemprestimo); }
		
		void mostradiaderetorno(){
			System.out.println("O dia de retorno é: " + diaderetorno); }
		
		void mostramesderetorno(){
			System.out.println("O mês de retorno é: " + mesderetorno); }
		
		void mostraanoderetorno(){
			System.out.println("O ano de retorno é: " + anoderetorno); }
		
		
}
