package prog06;

public class ChamaContatoAgenda {

	public static void main(String[] args) {

		ContatoAgenda ca = new ContatoAgenda();
		
		ca.nome = "FABAO";
		ca.telefone = "999558787";
		ca.endereço = "Rua Brasil 454";
		ca.organizaçao = "UNOPAR";
		ca.email = "fabao123@gmail.com";
		
		ca.mostranome();
		ca.mostratelefone();
		ca.mostraendereço();
		ca.mostraorganizacao();
		ca.mostraemail();
		
				
	}

}
