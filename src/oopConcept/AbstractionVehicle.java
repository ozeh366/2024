package oopConcept;

//abstract class
public abstract class AbstractionVehicle {

	static int a = 1;
	int b = 10;
	final int c = 7;
	
	//Abstract Method
	abstract void startEngine();
	
	abstract void Engine();
	
	//non abstract method
	void stopEngine() {
		System.out.println("Engine stopped");
	}
	

}
