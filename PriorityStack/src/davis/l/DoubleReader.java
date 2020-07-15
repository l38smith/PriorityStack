package davis.l;
import java.util.Scanner;


public class DoubleReader {

protected Scanner scanner;

public DoubleReader() {
	scanner = new Scanner(System.in);
	}

public Double nextDouble() {
	
		
	Double returnValue = null;
	while (true) {
		System.out.print("Enter a double (\".\" when done): ");
		String userInput = scanner.nextLine();
		userInput = userInput.trim();  
		if (".".equals(userInput)) {
			
			returnValue = null;
		
		break;
	}
try {
	returnValue = new Double (userInput);
	break;	
	

} catch (NumberFormatException e) {
	System.out.printf(" %n \"%s\" is not a double. Try again.%n%n",userInput);
	
}


}

return returnValue;
}

}






