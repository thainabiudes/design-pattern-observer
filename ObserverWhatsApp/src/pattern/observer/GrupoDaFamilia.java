package pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class GrupoDaFamilia implements Mensagem {

	private String mensagem;
	private List<Observer> observers;

	public GrupoDaFamilia() {
		this.observers = new ArrayList<Observer>();
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
		notificarObservers();
	}

	@Override
	public void notificarObservers() {
		for (Observer observer : observers) {
			observer.enviarMensagem(mensagem);
		}
	}

	@Override
	public void registrarObserver(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void removerObserver(Observer observer) {
		int i = observers.indexOf(observer);
		if (i >= 0) {
			observers.remove(i);
		}
	}
}