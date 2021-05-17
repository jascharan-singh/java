import java.text.DecimalFormat;
import java.util.Scanner; // Needed for the Scanner class 
 
/** 
 This program allows the user to order a pizza. 
*/ 
 
public class PizzaOrder 
{  
public static void main (String[] args) 
 { 
// Create a Scanner object to read input. 
Scanner keyboard = new Scanner (System.in); 
Scanner key =new Scanner(System.in);
 
String firstName;
// User's first name 
boolean discount = false; 

// Flag for discount 
int inches;
// Size of the pizza 
char crustType; 
// For type of crust 
String crust="hand-Tosted" ; 
// Name of crust 
double cost = 0;
// Cost of the pizza 
final double TAX_RATE = .08;
// Sales tax rate 
double tax = 0; 
// Amount of tax 
char choice; 
//User's choice 
String input;
// User input 
String toppings = "Cheese "; 
// List of toppings 
int numberOfToppings = 0; 
// Number of toppings 
int discount_amount=0;
 
// Prompt user and get first name. 
System.out.println("Welcome to Mike and " +  	"Diane's Pizza"); 
System.out.print("Enter your first name: "); 
firstName = keyboard.nextLine(); 
   
 
// Determine if user is eligible for discount by 
// having the same first name as one of the owners. 
// ADD LINES HERE FOR TASK #1 
if (firstName.equals("Mike") || firstName.equals("MIKE") || firstName.equals("Diane") || firstName.equals("DIANE") ) {
	discount=true;
}

// Prompt user and get pizza size choice. 
System.out.println("Pizza Size (inches) Cost"); 
	System.out.println(" 	10 	$10.99"); 
	System.out.println(" 	12 	$12.99"); 
	System.out.println(" 	14 	$14.99"); 
	System.out.println(" 	16 	$16.99"); 
System.out.println("What size pizza " + 	"would you like?");  
System.out.println("10, 12, 14, or 16 " + "(enter the number only) "); 
 inches=keyboard.nextInt();
 
// Set price and size of pizza ordered.
//ADD LINES HERE FOR TASK #2
if (inches==10) {
	cost=10.99;
	System.out.println("10-inch Pizza Hand-tossed crust    $" +cost );
	
}
if (inches==12) {
	cost=12.99;
	System.out.println("12-inch Pizza Hand-tossed crust    $" +cost );
}
 if (inches==14) {
	cost=14.99;
	System.out.println("14-inch Pizza Hand-tossed crust    $" +cost );
}
 if (inches==16) {
	cost=16.99;
	System.out.println("16-inch Pizza Hand-tossed crust    $" +cost );
}
	 
 
// Consume the remaining newline character. keyboard.nextLine(); 
 System.out.println(" " );
// Prompt user and get crust choice. 
	System.out.println("What type of crust do you want? "); 
 	System.out.println("(H)Hand-tossed, " + "(T) Thin-crust, or (D) Deep-dish " +"(enter H, T, or D): "); 
 	input = key.nextLine();
	crustType = input.charAt(0); 
// Set user's crust choice on pizza ordered.
// ADD LINES FOR TASK #3	 
	switch(crustType) {
	case 'H': 
	System.out.println("You selected Hand-tossed");
	break;
	case 'T':
	 	System.out.println("You selected Thin-crust");
	 	break;
	case 'D':
	 	System.out.println("Deep-Dish");
	 	break;
	case 'h': 
	 	System.out.println("You selected Hand-tossed");
	 	break;
	 	case 't':
	 	 	System.out.println("You selected Thin-crust");
	 	 	break;
	 	case 'd':
	 	 	System.out.println("You SelectedDeep-Dish");
	 	 	break;
	 	default:
	 		System.out.println("You selected Hand-Tossted");
	
	}
// Prompt user and get topping choices one at a time. 
System.out.println("All pizzas come with cheese."); 
System.out.println("Additional toppings are " +  	"$1.25 each, choose from:"); 
System.out.println("Pepperoni, Sausage, " + "Onion, Mushroom"); 
 
   
   
 
// If topping is desired, 
// add to topping list and number of toppings 
System.out.println("Do you want Pepperoni? (Y/N):");
	input = key.nextLine();
	choice = input.charAt(0);
	if (choice == 'Y' || choice == 'y') 
{ 
 	numberOfToppings += 1; 
toppings = toppings + "Pepperoni "; 
 	} 
System.out.println("Do you want Sausage? (Y/N): ");  
input = key.nextLine();
choice = input.charAt(0);
if (choice == 'Y' || choice == 'y') 
 	{ 
numberOfToppings += 1; toppings = toppings + "Sausage "; 
 	} 
System.out.println("Do you want Onion? (Y/N): ");
input = key.nextLine();
choice = input.charAt(0);
if (choice == 'Y' || choice == 'y') 
 	{ 
numberOfToppings += 1; toppings 
= toppings + "Onion "; 
 	} 
System.out.println("Do you want Mushroom? (Y/N): ");
 input = key.nextLine();
 choice = input.charAt(0); 
 	if (choice == 'Y' || choice == 'y') 
{ numberOfToppings += 1; 
 	toppings = toppings + "Mushroom "; } 
 
// Add additional toppings cost to cost of pizza. 
cost = cost + (1.25 * numberOfToppings); 
 
// Display order confirmation. 
System.out.println(); System.out.println("Your order is as follows: "); 
//System.out.println(inches + " inch pizza"); 
System.out.println(crust + " crust"); 
System.out.println(toppings); 
  
 
 
// Apply discount if user is eligible.
// ADD LINES FOR TASK #4 HERE	 
 if(discount) {
	  discount_amount=2;
 }
 
 	// EDIT PROGRAM FOR TASK #5 
// SO ALL MONEY OUTPUT APPEARS WITH 2 DECIMAL PLACES  
 DecimalFormat df= new DecimalFormat(".00");
System.out.println("The cost of your order " + "is:" + df.format(cost)); 
 
// Calculate and display tax and total cost. tax = cost * TAX_RATE;
	tax=cost*TAX_RATE;
System.out.println("The tax is: "+ df.format(tax)); 
 	System.out.println("The total due is: " +df.format(tax + cost-discount_amount)); 
 
System.out.println("Your order will be ready " + "for pickup in 30 minutes."); } 
} 
 
   
   
   
   
   
	
   
   
