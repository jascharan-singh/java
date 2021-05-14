


/*----------------------------------------------DO NOT RUN THIS FILE PLEASE RUN GeometryDemo---------------------------------------*/

/*----------------------------------------------DO NOT RUN THIS FILE PLEASE RUN GeometryDemo---------------------------------------*/

/*----------------------------------------------DO NOT RUN THIS FILE PLEASE RUN GeometryDemo---------------------------------------*/

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class Geometry {
	static public int choice;
	static public double radius,area;
	static double lenght,width;
	static String repeat;
	static int repeat_time=1;

	
	public static void main(String[] args) {
		printMenu();//CALLING printMenu function
		
	}
	/*----------------------------------------------------------printMenu function-------------------------------------------------------------------------*/
	public static void printMenu(){
		
		System.out.println("This is a geometry calculator");
		System.out.println("Choose what you would like to calculate");
		System.out.println("1. Find the area of a circle");
		System.out.println("2. Find the area of a rectangle");
		System.out.println("3. Find the area of a triangle");
		System.out.println("4. Find the circumference of a circle");
		System.out.println("5. Find the perimeter of a rectangle");
		System.out.println("6. Find the perimeter of a triangle");
		
	
	}
	
	
	
	
/*------------------------------------------------------------SIX RETURNING METHODS------------------------------------------------------------------------*/

/*--------------------------------------------------------------first method-------------------------------------------------------------------------------*/
	static double circleArea( ) {
			 radius = Double.parseDouble(JOptionPane.showInputDialog("Please Enter radius"));
			  area=3.14*radius*radius;
			 return area;
		}
		  
	
	
/*---------------------------------------------------------------second method------------------------------------------------------------------------------*/	
	 static double rectangleArea() {
		  
			 lenght = Double.parseDouble(JOptionPane.showInputDialog("Please Enter lenght"));
			 width= Double.parseDouble(JOptionPane.showInputDialog("Please Enter width"));
			  area=lenght*width;	  
		return area;
	  }
	 
	 
	 
/*---------------------------------------------------------------third method-------------------------------------------------------------------------------*/	 
	  static double triangleArea() {
		  
			double base= Integer.parseInt(JOptionPane.showInputDialog("Please Enter base"));
			double height= Integer.parseInt(JOptionPane.showInputDialog("Please Enter height"));
			double area=0.50*base*height;
		return area;
	  }
	    
/*----------------------------------------------------------------FORTH method-----------------------------------------------------------------------------*/	  
	  static double circleCircumference() {
		  
			 double radius= Integer.parseInt(JOptionPane.showInputDialog("Please Enter radius"));
			 double area=2*3.14*radius;
	   return area;
		 
	  }
	  
/*---------------------------------------------------------------fifth method-----------------------------------------------------------------------------*/	  
	  static double rectanglePerimeter() {
		  
			  double lenght= Integer.parseInt(JOptionPane.showInputDialog("Please Enter lenght"));
			  double width= Integer.parseInt(JOptionPane.showInputDialog("Please Enter width"));
			  double area=lenght*lenght*width*width;
		return area;
		  
	  }
	    
/*----------------------------------------------------------------------six method------------------------------------------------------------------------*/	  
	  static double trianglePerimeter() {
		  
			  double first= Integer.parseInt(JOptionPane.showInputDialog("Please Enter First side"));
			  double second= Integer.parseInt(JOptionPane.showInputDialog("Please Enter Second side"));
			  double third= Integer.parseInt(JOptionPane.showInputDialog("Please Enter third side"));
			  double area=first+second+third;
	   return area;
	  }
	
	  
}
