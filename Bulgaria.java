package chainstateobserver;
	import java.util.ArrayList;
	import java.util.List;

public class Bulgaria extends Employee implements Observable{

		private List<Observer> observers = new ArrayList<Observer>();
		public Bulgaria() {
			this.level = Employee.Bulgaria;
		}
		
		@Override
		protected void logMessage(String message) {
			
		      System.out.println("Client has entered the office to send parcel in Bulgaria." + message);
			
			  Context context = new Context();

		      PreparationState preparationState = new PreparationState();
		      preparationState.doAction(context);

		      System.out.println(context.getState().toString());
		      notifyObservers();

		      System.out.println("Bulgarian employee is waiting for the next client.");
		}
		@Override
		public void registered(Observer observer) {
			this.observers.add(observer);
			observer.setEmployee(this);
			
		}
		@Override
		public void unregistered(Observer observer) {
			this.observers.remove(observer);		
		}
		@Override
		public void notifyObservers() {
			for(Observer observer: this.observers) {
				observer.update();
			}
		}

		public void unregistreted(Observer observer) {
			// TODO Auto-generated method stub
			
		}
	}
