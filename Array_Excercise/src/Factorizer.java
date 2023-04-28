import java.util.Scanner;
import java.text.DecimalFormat;

public class Factorizer {

	public static void main(String[] args) {
		// create an object of Scanner class to read the user input
	    Scanner input = new Scanner(System.in);
	    try {
		    // take input from users
		    System.out.print("Enter the principal: ");
	    	double principal = input.nextDouble();
	
		    System.out.print("Enter the annual interest rate: ");
		    double rate1 = input.nextDouble();
	
		    System.out.print("Enter the time : ");
		    double time1 = input.nextDouble();
	
		    System.out.print("Enter number of times interest is compounded in a year: ");
		    int number = input.nextInt();
		    
		    //Calculate the quarterly interest rate.
		    rate1 = rate1/number;
	
		    //iterate in the for loop to the time number of times
		    System.out.println("Calculating...\n ");
		    for(int i =1 ; i<= time1;i++) {
		    	//compute the compound interest
		    	double interest1 = principal * (Math.pow((1 + rate1/100), (1 * number))) - principal;
		    	DecimalFormat df=new DecimalFormat("0.00");
		    	System.out.println("Year"+ (i) +": Began with " + 
		    						df.format(principal) + " Earned, "+ 
		    						df.format(interest1)+", Ended with "+ 
		    						df.format(interest1+principal));
		    	principal = interest1+principal;
		    }
	    }
	    catch(Exception e) {
	    	System.out.println("Invalid input .Programme terminated");
	    }
	    finally {
	    	input.close();
	    }
	}
}
