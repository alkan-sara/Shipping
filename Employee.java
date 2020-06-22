package chainstateobserver;

	public abstract class Employee implements Observable{
		public static int WorldWide = 1;
		public static int Bulgaria = 2;
		public static int  Plovdiv= 3;
		
		protected int level;
		protected Employee nextEmployee;
		
		public void setNextEmployee(Employee nextEmployee) {
			this.nextEmployee = nextEmployee;
		}
		
		public void handleMessage(String message, int level) {
			if(this.level == level) {
				this.logMessage(message);
				return;
			}
			if(this.nextEmployee != null) {
				this.nextEmployee.handleMessage(message, level);
			}
		}
		abstract protected void logMessage(String message);

		public void unregistered(Observer observer) {
			// TODO Auto-generated method stub
			
		}

		public void registered(Observer observer) {
			// TODO Auto-generated method stub
			
		}

	}

