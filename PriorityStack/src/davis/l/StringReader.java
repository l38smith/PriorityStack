package davis.l;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class StringReader  {
	 
	protected Scanner scanner;
	
	public StringReader () {
		scanner = new Scanner (System.in);
	
	}

public String nextString() {
	
	String returnValue = null;
	while (true ){
	   System.out.print("Enter a string (\".\" when done): ");
	   String userInput = scanner.nextLine();
	   userInput = userInput.trim();  
	   
	 
	   if (".".equals(userInput)) {
			returnValue = null;
			break;}
			else if(userInput.trim().equals("") || userInput == null) {
			System.out.printf(" %n \"%s\" is not an string. Try again.%n%n", userInput);
			
		}
	try {
		returnValue = new String(userInput);
		break;
	} catch (NoSuchElementException noSuchElementException) {
		System.out.printf(" %n \"%s\" is not an string. Try again.%n%n", userInput);
		
	}
     }

	return returnValue;

	}
  	 }









