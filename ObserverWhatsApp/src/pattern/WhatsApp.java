package pattern;

import pattern.domain.PessoaA;
import pattern.domain.PessoaB;
import pattern.observer.GrupoDaFamilia;

public class WhatsApp {
	
	public static void main(String[] args) {
		
		GrupoDaFamilia grupo = new GrupoDaFamilia();
		
		PessoaA pessoaA = new PessoaA(grupo);
		
		PessoaB pessoaB = new PessoaB(grupo);
		
		grupo.setMensagem("Olá, bem-vindo ao grupo da família! ");
		
	}

}
