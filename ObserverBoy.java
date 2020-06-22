package chainstateobserver;

public class ObserverBoy extends Observer {

		private String name;
		private Observable employee;
		
		public ObserverBoy(String name) {
			this.name = name;
		}
		
		@Override
		public void update() {
			if(employee == null) {
				
				System.out.println("There is no parcels to take to the store!");
				return;
			}
			System.out.println(name+" is taking the parcels.");
		}

		@Override
		public void setEmployee(Observable employee) {
			this.employee = employee;
		}
	}
}
