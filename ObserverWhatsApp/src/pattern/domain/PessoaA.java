package pattern.domain;

import pattern.observer.Mensagem;
import pattern.observer.Observer;

public class PessoaA implements Observer {

	private String nome;
	
	private Mensagem mensagem;

	public PessoaA(Mensagem mensagem) {
		this.mensagem = mensagem;
		this.mensagem.registrarObserver(this);
		this.nome = "Pessoa A";
	}
	
	@Override
	public void enviarMensagem(String mensagem) {
		System.out.println(mensagem + this.nome);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
