package oopConcept;

public interface Interface1 {
	
	/*Interface: In Java, an interface is a reference type, similar to a class, that can contain only constants, 
		method signatures, abstract methods, default methods, static methods, and nested types. 
		Interfaces cannot contain instance fields. The methods in interfaces are abstract by default.

	 * Basic Concepts of Interfaces
		Abstract Methods: These are methods that are declared without an implementation. 
		Classes that implement the interface must provide the body for these methods.
		
		Default Methods: Introduced in Java 8, these are methods in interfaces that have an implementation. 
		They help to add new functionality to interfaces without breaking the existing implementation of the interface.
		
		Static Methods: Also introduced in Java 8, these can be defined in interfaces and can be called independently of any object.
		
		Constants: Variables defined in interfaces are public, static, and final by default.
	 * 
	 */
	
	/*Examples of interfaces
	 * 
	 * Configuration Interface java// In this example, the interface DatabaseConfig provides database connection details that remain constant throughout the application.
	 * 
	 * public interface DatabaseConfig {
		    String URL = "jdbc:mysql://localhost:3306/myDatabase";
		    String USER = "root";
		    String PASSWORD = "password123";
		}
		
		Math Constant Interface // This MathConstants interface stores constants related to mathematics, which could be used throughout scientific or mathematical applications.
		
		public interface MathConstants {
	    double PI = 3.14159;
	    double E = 2.71828;
		}
		
		Role Permissions // This example might be used in a system where permissions are checked against these constants to decide what operations a user can perform.

		public interface RolePermissions {
		    int READ = 1;
		    int WRITE = 2;
		    int EXECUTE = 4;
		}
		
		Game Setting Interface // In a gaming application, GameSettings could provide standard configuration limits and defaults used across the game.
		
		public interface GameSettings {
	    int MAX_PLAYERS = 10;
	    int TIME_LIMIT = 30;  // seconds
	    String DEFAULT_AVATAR = "default_avatar.png";
		}

		System State // The SystemStates interface could be used in an application that monitors or manages different states of a system or process, providing clear numeric codes for each state.
		
		public interface SystemStates {
	    int IDLE = 0;
	    int RUNNING = 1;
	    int PAUSED = 2;
	    int STOPPED = 3;
		}
		
		
		Implementing Constant
		
		DatabaseConnector
		
		public class DatabaseConnector {
	    public void connect() {
	        System.out.println("Connecting to: " + DatabaseConfig.URL);
	        // Additional connection logic here
			    }
			}
			
			public class MathUtil {
			    public double areaOfCircle(double radius) {
			        return MathConstants.PI * radius * radius;
			    }
			}
			
			public class FileAccess {
			    public void setPermissions(int permissions) {
			        if ((permissions & RolePermissions.WRITE) == RolePermissions.WRITE) {
			            System.out.println("Write access granted.");
			        }
			    }
	 */
	
	String URL = "www.fb.com"; // constant
	
	public static void bark() {
		System.out.println();
	}
	
	abstract void call(); // abstract method
	
	default int mon() { //default method
		System.out.println("default method");
		return 0;
	}
}
