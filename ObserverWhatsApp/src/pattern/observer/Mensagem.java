package pattern.observer;

public interface Mensagem {
	
	public void registrarObserver(Observer observer);
	public void removerObserver(Observer observer);
	public void notificarObservers();

}
