import java.util.Scanner;                           //Calling classes that will be used in the program
import java.util.Random;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class popCorn {
    public static void main (String[] args) {
                                                   //Creating a new object of the classes
        Scanner scnr = new Scanner (System.in);
        Random randGen = new Random(); 
        NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
        DecimalFormat fmt2 = new DecimalFormat ("#,###.00");
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

                                                   //Declaring variables and assigning constants
    final String vendorId = "101MO";
    int popcornPricePennies = 450;
    int softdrinkPricePennies = 100;
    int numBagsPurchased;
    int numDrinkPurchased;
    int randomNumber;
    double popCornPriceDollars;
    double softdrinkPriceDollars;
    double total;
    String firstName;
    String lastName;
    String confirmation;
    char poundSign = '#';
    char timeSign = '@';
    
                                                //Getting values from the user

    System.out.print("Enter your first name: ");
    firstName = scnr.next();
    
    System.out.print("Enter your last name: ");
    lastName = scnr.next();

    System.out.println("Number of popcorn bags purchased:");
    numBagsPurchased = scnr.nextInt();
    
    System.out.println("Number of soft drinks purchased:");
    numDrinkPurchased = scnr.nextInt();
                                                //Generating the random number between 1000-5000
    randomNumber = randGen.nextInt(4000) + 1000;
                                                //Using the charAt string Method to get the specified character
    char firstInitial = firstName.charAt(0);
    
                                                //Creating the confirmation
                                                
    confirmation = ("POPCORN" + poundSign + lastName + poundSign + firstInitial + poundSign + randomNumber + poundSign + vendorId);
    
                                                //Printing the shop name the customer name and the confirmation number
                                                
    System.out.println("\t" + "**** Mustafa's Best Popcorn! ****\n");
    System.out.println("Confirmation for " + firstName + " " + lastName + "\n");
    System.out.println("Confirmation Number is: " + confirmation + "\n");
    
    popCornPriceDollars = (double)popcornPricePennies / 100;
    
    
    System.out.println("Popcorn:\t " + numBagsPurchased + " " + timeSign + " " + fmt1.format(popCornPriceDollars) + " " + "each"
    +"\n");
    
                                                   //converting the integer of pennies to double to have a double result.
    softdrinkPriceDollars = (double)softdrinkPricePennies / 100;
    
    System.out.println("Soft Drinks:\t " + numDrinkPurchased + " " + timeSign + " " + fmt1.format(softdrinkPriceDollars)
    + " " + "each" + "\n");
    
                                                    //Calculating the total
    total = (numBagsPurchased * popCornPriceDollars) + (numDrinkPurchased * softdrinkPriceDollars);
                                                    //Printing out the total 
    System.out.println("TOTAL IS:\t " +"$"+ fmt2.format(total));
                                                    //Instantiate a date object by invoking its constructor Date 
    Date date = new Date();                 
    
    System.out.println("\n");
                                                    //Printing out the current date
    System.out.println("Thank you for visiting our shop on: " + formatter.format(date));
    }
}

    
    
    
    
        
 

        

    




 