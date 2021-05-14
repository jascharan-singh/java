import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class quiz1 {

	public static void main(String[] args) {
		
		int customer_number_cus= Integer.parseInt(JOptionPane.showInputDialog("Customer Number "));
		String type_dis= JOptionPane.showInputDialog("Which type of  cleaning disinfectant you want? \nWindex Disinfectant (Press W) \nLysol Disinfectant Spray(Press L) \nClorox Disinfecting Wipes (Press C)");
		int customer_number_item= Integer.parseInt(JOptionPane.showInputDialog("Number of Item "));
		int customer_number_liters= Integer.parseInt(JOptionPane.showInputDialog("Enter number of liters sold:"));
		double customer_number_price= Double.parseDouble(JOptionPane.showInputDialog("Enter Price of each liter:"));
		System.out.println("ABC Cleaning Supplies\n31-10 Thomson Ave.\nLong Island City, NY 11101\n(718)482-7200\n\nDaily Sales Summary\n--------------------");		
		System.out.println("Number of Customers   : " );
		if(type_dis.equals("w") || type_dis.equals("W") ) {
		System.out.println("Type of disinfectant  : " );
		}
		if(type_dis.equals("l") || type_dis.equals("L") ) {
		System.out.println("Type of disinfectant  : " );
			}
		if(type_dis.equals("c") || type_dis.equals("C") ) {
		System.out.println("Type of disinfectant  :" );
				}
		System.out.println("Number of Items       : ");
		System.out.println("Quantity of Liter sold: " );
		double liters_price= customer_number_liters*customer_number_price;
		System.out.println("Subtotal              :$" );
		double liter_price_tax= liters_price*0.08875;
		DecimalFormat df= new DecimalFormat(".00");
		System.out.println("Sales tax (8.875%)    :$" );
		System.out.println("Total amount          :$");
	}

}
