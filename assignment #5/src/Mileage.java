/*it will take input of how many miles a person driven 
 * and gallon used then it will give output of mile per gallon
 * Jascharan singh
 * 5/12/2021
 * */
import java.text.DecimalFormat;
import java.util.Scanner;
public class Mileage {

	public static void main(String[] args) {
		double m;//it will store total miles	
		double g;// it will store total gallons
		double r;//it will give us result of mile per galoon
		// TODO Auto-generated method stub
		//Print a line indicating this program will calculate mileage 
		System.out.println("This program will calculate mileage ");
		Scanner keyword=new Scanner(System.in);// creating object
		//Print prompt to user asking for miles driven 
		System.out.print("How many miles have you driven: ");
		//Read in miles driven 
		m=keyword.nextDouble();
		//Print prompt to user asking for gallons used 
		System.out.print("How many gallons have you used: ");
		//Read in gallons used 
		g=keyword.nextDouble();
		//Calculate miles per gallon by dividing miles driven by gallons used 
		r=m/g;
		//Print miles per gallon along with appropriate labels 
		DecimalFormat df= new DecimalFormat(".00");// it will give us only two decimal after point
		System.out.println("Total miles: "+ m + "\nTotal gallons: "+ g+ "\nTotal mile per gallon is: "+ df.format(r));
		// it will calculate mile per gallon
	}

}
