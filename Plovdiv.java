package chainstateobserver;

mport java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Plovdiv extends Employee{

	private List<Observer> observers = new ArrayList<Observer>();
	
	public Plovdiv() {
		this.level = Employee.Plovdiv;
	}
	
	@Override
	protected void logMessage(String message) {
		
	      System.out.println("Client has entered the office to send parcel in Plovdiv city." + message);
		
		  Context context = new Context();

	      PreparationState preparationState = new PreparationState();
	      preparationState.doAction(context);

	      System.out.println(context.getState().toString());
	      
	      notifyObservers();

	      System.out.println("Plovdiv employee is waiting for the next client.");
	}
	@Override
	public void registered(Observer observer) {
		this.observers.add(observer);
		observer.setEmployee(this);
		
	}
	@Override
	public void unregistreted(Observer observer) {
		this.observers.remove(observer);		
	}
	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}
	}

	@Override
	public void unregistreted(Observer observer) {
		// TODO Auto-generated method stub
		
	}
}