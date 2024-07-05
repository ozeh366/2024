package oopConcept;


 public class PracticeCar {
	
	//instance variables
	private String brand;
	private String color;
	private int year;

	
	//Global Variable
	private static int numberOfCars;
	

	public PracticeCar() {
		numberOfCars++;
	}
	
	public PracticeCar(String brand, String color1, int year) {
		this.brand = brand;
		this.color = color1;
		this.year = year;
		numberOfCars++; //increment to keep track of cars in the class
	
	}

	public void displayInfo() {
		System.out.println("Brand: " + brand + ", color: " + color + ", year: " + year);
	}
	
	public static void carCount() {
		System.out.println("Total number of cars is " + numberOfCars);
	}
	
	public static boolean isExpensive(int cost) {
		if (cost >= 50000 ) {
			System.out.println("Too Expensive");
			return true;
		}else {
			System.out.println("Good Deal");
			return false;
		} 
	}
	
	public static void main(String[] args) {
	PracticeCar car1 = new PracticeCar("Toyota", "red", 3);
	PracticeCar car2 = new PracticeCar("Tesla", "Green", 4);
	PracticeCar car3 = new PracticeCar("Jaguar", "Black", 9);
	PracticeCar car4 = new PracticeCar();
	car4.brand = "Mercedez";
	car4.color = "Blue";
	car4.year = 4;


	
	
	car1.displayInfo();
	car2.displayInfo();
	car3.displayInfo();
	car4.displayInfo();
	carCount();
	
	}
	
	 void honkHorn() {
		System.out.println("honking started!!");

	}
}
