// TASK #2 Add an import statement for the Scanner class
import java.text.DecimalFormat;
import java.util.Scanner;
// TASK #2(Alternate)	 
// Add an import statement for the JOptionPane class	 
 
/** 
This program demonstrates how numeric types and operators behave in Java. 
*/ 
 public class NumericTypes 
{ public static void main (String [] args) 
{ 
	
// TASK #2 Create a Scanner object here
	Scanner keyword=new Scanner(System.in);
// (not used for alternate)	 

// Identifier declarations 
final int NUMBER = 2 ; 	// Number of scores 
final int SCORE1 = 100; 	// First test score 
final int SCORE2 = 95; 	// Second test score 
final int BOILING_IN_F = 212; // Boiling temperature 
double fToC; 	// Temperature Celsius 
double average; 	// Arithmetic average 
String output; 	// Line of output 
// TASK #2 declare variables used here
String firstName;
String lastName;
String fullName;
// TASK #3 declare variables used here
char firstInitial;
// TASK #4 declare variables used here
double diamerter;
double radius; 
double volume;
// Find an arithmetic average. 
average = (SCORE1 + SCORE2 )/ NUMBER; 
output = SCORE1 + " and " + SCORE2 + " have an average of " + average; 
System.out.println(output); 
 
// Convert Fahrenheit temperature to Celsius. 
fToC = (0.55555556) * (BOILING_IN_F - 32); 
DecimalFormat df= new DecimalFormat(".00");
output = BOILING_IN_F + " in Fahrenheit is " + df.format(fToC) + " in Celsius."; 
System.out.println(output); 
System.out.println(); 	// To leave a blank line 
 
// ADD LINES FOR TASK #2 HERE 
// Prompt the user for first name 
	System.out.print("Enter First Name : ");
// Read the user's first name 
	 firstName= keyword.nextLine();
// Prompt the user for last name 
	 System.out.print("Enter Last Name : ");
// Read the user's last name 
	 lastName= keyword.nextLine();
// Concatenate the user's first and last names
	 fullName= firstName+" "+lastName;
// Print out the user's full name 
	System.out.println("Fullname you entered : "+fullName); 	// To leave a blank line 
// ADD LINES FOR TASK #3 HERE 
// Get the first character from the user's first name
	firstInitial=firstName.charAt(0);
// Print out the user's first initial
	System.out.println("First letter of your firstname is : "+firstInitial);
// Convert the user's full name to uppercase 
	fullName=fullName.toUpperCase();
// Print out the user's full name in uppercase 
	System.out.println("Your fullname in uppercase : "+ fullName); 	// To leave a blank line 
	System.out.println(fullName.length());
// ADD LINES FOR TASK #4 HERE 
// Prompt the user for a diameter of a sphere 
	System.out.println("Enter the diameter of a sphere: ");
// Read the diameter
	diamerter=keyword.nextDouble();
	
// Calculate the radius
	radius= diamerter/2;
// Calculate the volume 
	volume= 1.33333333*Math.PI*Math.pow(radius,3);
// Print out the volume 
	
	System.out.println("The volume of sphere is : "+df.format(volume));
} 
} 
