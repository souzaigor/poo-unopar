package prog06;

public class ChamaContatoAgenda {

	public static void main(String[] args) {

		ContatoAgenda ca = new ContatoAgenda();
		
		ca.nome = "FABAO";
		ca.telefone = "999558787";
		ca.endere�o = "Rua Brasil 454";
		ca.organiza�ao = "UNOPAR";
		ca.email = "fabao123@gmail.com";
		
		ca.mostranome();
		ca.mostratelefone();
		ca.mostraendere�o();
		ca.mostraorganizacao();
		ca.mostraemail();
		
				
	}

}
