package chainstateobserver;

public class PreparationState implements State{

	public void doAction(Context context) { 
		
		System.out.println("Parcel is in preparation .");
		context.setState(this);	
	}

	public String toString() {
		return "Preparation state";
	}
}
