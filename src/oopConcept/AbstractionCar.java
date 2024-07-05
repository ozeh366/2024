package oopConcept;

public class AbstractionCar extends AbstractionVehicle implements Interface1 {
	
	//@Override
	void startEngine() {
		System.out.println("Engine is starting");
	} 
	

	@Override
	void Engine() {
		
	}
	public static void main(String[] args) {
		AbstractionCar tesla = new AbstractionCar();
		tesla.startEngine();
	//	tesla.stopEngine();
	}


	@Override
	public void call() {
		System.out.println(URL);
		
	}


}
