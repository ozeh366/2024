package oopConcept;

public class GettersandSetters {
	
	String message;
	
	 public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	


	private String name;
	
	public String getName() {
		return this.name;
	}
	
	public void setName (String name) {
		this.name = name;
	}

	
	

	 private String getTextConverter(String message) {
		 String formattedMessage = formatMessage(message);
		 System.out.println(formattedMessage);
		 return message;
		 }
		
	 
	 // create helper class
		 private String formatMessage(String msg) {
			 return "formatted " + msg.toUpperCase();
		 }
	
		 public static void main(String[] args) {
			 GettersandSetters g1 = new GettersandSetters();

			 g1.getTextConverter("tommy");
		
			 

			
	}
}
