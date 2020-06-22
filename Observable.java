package chainstateobserver;

public interface Observable {

	public void registered(Observer observer);
	public void unregistreted(Observer observer);
	public void notifyObservers();
}