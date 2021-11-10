package pattern.domain;

import pattern.observer.Mensagem;
import pattern.observer.Observer;

public class PessoaB implements Observer {

	private String nome;
	
	private Mensagem mensagem;

	public PessoaB(Mensagem mensagem) {
		this.mensagem = mensagem;
		this.mensagem.registrarObserver(this);
		this.nome = "Pessoa B";
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
