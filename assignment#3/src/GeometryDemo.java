import java.text.DecimalFormat;
import javax.swing.JOptionPane;

//import com.sun.org.apache.xpath.internal.operations.Equals;
public class GeometryDemo {

	public static void main(String[] args) {
		
		Geometry c=new Geometry();//CONNECTION Geometry FILE TO THIS FILE
		
		
		
		c.printMenu();//CALLING printMenu function
		
		
		
/*------------------------------------------------------------SIX OPTION TO CHOOSE---------------------------------------------------------------------------------*/		
		for(int i=0;i<c.repeat_time;i++) {//c.repeat_time it will keep increment until user say no
		c.choice = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of your choice"));// TAKING CHOICE INPUT
		if(c.choice==1) {
			System.out.println("\nThe area of a circle: "+c.circleArea());//circleArea FUNCTION
		}
		if(c.choice==2) {
			System.out.println("\nThe area of a rectangle: "+c.rectangleArea());//rectangleArea FUNCTION
		}
		if(c.choice==3) {
			System.out.println("\nThe area of a triangle: "+c.triangleArea());//triangleArea FUNCTION
		}
		if(c.choice==4) {
			DecimalFormat df= new DecimalFormat(".00");
			System.out.println("\nThe circumference of a circle: "+df.format(c.circleCircumference()));
		}
		if(c.choice==5) {
			DecimalFormat df= new DecimalFormat(".00");
			System.out.println("\nThe perimeter of a rectangle: "+df.format(c.rectanglePerimeter()));//circleCircumference FUNCTION
		}
		if(c.choice==6) {
			DecimalFormat df= new DecimalFormat(".00");
			System.out.println("\nThe perimeter of a triangle: "+df.format(c.trianglePerimeter()));//trianglePerimeter FUNCTION
		}
		if (c.choice<=0 || c.choice>6){
			System.out.println("\n\nplease see the options and try again!!");//DEFAULT VALUE WITH MESSAGE
		}
		c.repeat = JOptionPane.showInputDialog("DO you want to use other method in geometry calculator(yes/no)");
		if(c.repeat.equals("yes") || c.repeat.equals("YES")) {
			c.repeat_time=c.repeat_time+1;
		}
		if(c.repeat.equals("no") || c.repeat.equals("NO")) {
			break;
		}
		
		}

}
	}