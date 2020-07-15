package davis.l;
import java.util.Scanner;
public class MainStack {
static Scanner sc  = new Scanner(System.in);



 
public static void main(String[] args) {
	System.out.printf("Welcome to Priority Stack !%n%n");
	MainMenu m = new MainMenu();
	m.menu();
	String choice = "";

	System.out.print(" \nSelection:");
  
	do {
		
		choice = sc.nextLine();

    
	
	 if  (choice.trim() == null || choice.trim().equals(" ")) {
		 System.out.println("Ooops, try again!");
		 System.out.print(" \nSelection:");
		 
		  }
	
	 else {
		 switch (choice) {
		 
		 case "1":
						 
			 System.out.printf("%n      Integers%n%n ");
			 PriorityStack<Integer> stack = new PriorityStack<> ();
			 IntegerScanner iReader = new IntegerScanner();
			 for (Integer i=iReader.nextReading(); i!=null; i=iReader.nextReading()) {
			 stack.push(i);
			
			 }
			  			 
			 while (!stack.isEmpty()) {
			
			 
             System.out.printf( "%d ",  stack.pop());
             	  
					     
			 }

				 m.menu();
				 System.out.print(" \nSelection:");
				 
				 break;
			 
		  
		 case "2":
			
			 System.out.printf("%n      Doubles%n%n ");
			 PriorityStack<Double> dstack = new PriorityStack<> ();
			 DoubleReader dReader = new DoubleReader();
			 for (Double k= dReader.nextDouble(); k!=null; k= dReader.nextDouble()) {
			 dstack.push(k );
			 
			 }		 
			 
			 
			while (!dstack.isEmpty()) {
				   			  
							  
			System.out.printf( " %.1f   ",   dstack.pop());	
			 	
			 }
			 
			 	 m.menu();
				 System.out.print(" \nSelection:");
				 
				 break;
		    
		 
		 case "3":
			 System.out.printf("%n   Strings%n%n");
			 PriorityStack<String> sStack = new PriorityStack<> ();
			 StringReader sReader =  new StringReader ();
			 for (String j=sReader.nextString(); j!=null; j=sReader.nextString()) {
			 sStack.push(j);
				 }

			while (!sStack.isEmpty()) {
				 
			System.out.print( sStack.pop() + "   ");	
			      
			      
			      } 
			 	 
		 
			      m.menu();
				  System.out.print(" \nSelection:");
				  
				  break;
			 
		 case "4":
			 Exit exit = new Exit();	
			 exit.goodBye();
			 break;
			
			
		default: 
			 System.out.println("Ooops, try again!");
			 System.out.print("Selection:");
			 break;
	}
	}
}while(true);
}}