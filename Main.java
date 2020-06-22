package chainstateobserver;

public class Main {
	public static class MainClass {
		private static Employee getChain(Employee WorldWideEmployee) {
			
			Observer obs1 = new ObserverBoy("1");
			
			Employee PlovdivEmployee = new Plovdiv();
			Employee BulgariaEmployee = new Bulgaria();
			Employee abroadEmployee = new WorldWide();
			PlovdivEmployee.setNextEmployee(BulgariaEmployee);
			BulgariaEmployee.setNextEmployee(WorldWideEmployee);
			abroadEmployee.setNextEmployee(PlovdivEmployee);
			PlovdivEmployee.registered(obs1);
			BulgariaEmployee.registered(obs1);
			BulgariaEmployee.registered(obs1);
			
			return abroadEmployee;
		}
		
		public static void main(String[] args) {
			
			Employee chain = getChain(chain);
			chain.handleMessage(" WorldWide employee accepts shipment.", 1);
			chain.handleMessage(" Bulgaria employee accepts shipment.", 2);
			chain.handleMessage(" Plovdiv employee accepts shipment.", 3);
		}

	}