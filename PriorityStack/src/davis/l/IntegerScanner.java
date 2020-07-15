package davis.l;
import java.util.Scanner;

public class IntegerScanner {

protected Scanner scanner;

public IntegerScanner() {
	scanner = new Scanner(System.in);
	}

public Integer nextReading() {
	
	Integer returnValue = null;
	while (true) {
		System.out.print("Enter an integer (\".\" when done): ");
		String userInput = scanner.nextLine();
		userInput = userInput.trim();  
		if (".".equals(userInput)) {
		returnValue = null;
		break;
		
		
		}
		
		
try {
	returnValue = new Integer(userInput);
	break;
} catch (NumberFormatException e) {
	System.out.printf(" %n \"%s\" is not an integer. Try again.%n%n",userInput);
	
}


}

return returnValue;

}


}







