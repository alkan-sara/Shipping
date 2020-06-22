package chainstateobserver;

import java.util.ArrayList;
import java.util.List;

public class WorldWide extends Employee{

	private List<Observer> observers = new ArrayList<Observer>();
	public String shipmentId;
	
	public WorldWide() {
		this.level = Employee.WorldWide;
	}
	
	@Override
	protected void logMessage(String msg) {
		
	      System.out.println("Client has entered the office to send worldwide parcel." + msg);
	
		  Context context = new Context();

	      PreparationState preparationState = new PreparationState();
	      preparationState.doAction(context);

	      System.out.println(context.getState().toString());
	      notifyObservers();
	      System.out.println("WorldWide employee is waiting for the next client.");
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
}