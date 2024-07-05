package oopConcept;

public class PracticeBenz extends PracticeCar {
	
	void honkHorn() {
		System.out.println("honking Stop!!");
	}
	
	public static void main(String[] args) {
		PracticeCar gle = new PracticeCar("GLE350", "Black", 2024);
		PracticeCar tesla = new PracticeCar("ModelX", "Blue", 2024);
		gle.displayInfo();
		carCount();
		isExpensive(45000);
		
		gle.honkHorn();
		
		PracticeBenz n1 = new PracticeBenz();
		n1.honkHorn();
		
		GettersandSetters nm = new GettersandSetters();
		nm.setName("Tommy");
		System.out.println(nm.getName());

	}

}
