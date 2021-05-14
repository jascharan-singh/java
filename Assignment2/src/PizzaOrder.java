yimport java.text.DecimalFormat;

import javax.swing.JOptionPane;
public class PizzaOrder {

	public static void main(String[] args) {
	String fname;
	String pizza_crust;
	String pizza_toppings_pepperoni;
	String pizza_toppings_sausage;
	String pizza_toppings_onion;
	String pizza_toppings_mushroom;double pizza_size;
	double pizza_size_cost=0;
	double pizza_toppings_pepperoni_price=0;
	double pizza_toppings_sausage_price=0;
	double pizza_toppings_onion_price=0;
	double pizza_toppings_mushroom_price=0;
	double subtotal_amount;
	double tax= 8.875/100;
	double subtotal_amount_tax;
	double subtotal_amount_after_tax;
	JOptionPane.showMessageDialog(null,"Welcome to Mac190 Pizza Shop");
	fname= JOptionPane.showInputDialog("Enter your first name:");
	
	
	/*                             pizza size menu                                                             */
	pizza_size=Double.parseDouble(JOptionPane.showInputDialog("Pizza sizes (inches) Cost \n10” $10.99 \n12” $12.99 \n14” $14.99 \n16” $16.99 \nWhat size pizza would you like? 10, 12, 14, or 16 (enter the number only)  " ));
	
	/*                             crusts                 type                                   */
	
	
	pizza_crust= JOptionPane.showInputDialog("What type of crust do you want? \n(H)Hand-tossed \n(T) Thin-crust \n(D) Deep-dish \n(enter H, T, or D)");
	 
	
	
	
	
	
	/*                                         Toppings menu                                                   */
	JOptionPane.showMessageDialog(null,"All pizzas come with cheese \n Additional toppings are $1.25 each, choose from: \nPepperoni, Sausage, Onion, Mushroom");
	pizza_toppings_pepperoni= JOptionPane.showInputDialog("Do you want Pepperoni? (Y/N)");
	pizza_toppings_sausage=JOptionPane.showInputDialog("Do you want Sausage? (Y/N)");
	pizza_toppings_onion=JOptionPane.showInputDialog("Do you want Onion? (Y/N)");
	pizza_toppings_mushroom=JOptionPane.showInputDialog("Do you want Mushroom? (Y/N)");
	System.out.println("Your order is as follows: ");
	System.out.println("Customer Name: "+ fname);
	
	
	
	
	/*                   pizza size with cost                           */
	
	if (pizza_size==10) {
		pizza_size_cost=10.99;
		System.out.println("10-inch Pizza Hand-tossed crust    $" +pizza_size_cost );
		
	}
	else if (pizza_size==12) {
		pizza_size_cost=12.99;
		System.out.println("12-inch Pizza Hand-tossed crust    $" +pizza_size_cost );
	}
	else if (pizza_size==14) {
		pizza_size_cost=14.99;
		System.out.println("14-inch Pizza Hand-tossed crust    $" +pizza_size_cost );
	}
	else if (pizza_size==16) {
		pizza_size_cost=16.99;
		System.out.println("16-inch Pizza Hand-tossed crust    $" +pizza_size_cost );
	}
	
	
	/*              Toppings                                             */
	 
	
	
	
	if(pizza_toppings_pepperoni.equals("Y") || pizza_toppings_pepperoni.equals("y") ) {
		pizza_toppings_pepperoni_price=1.25;
		System.out.println("Pepperoni                          $"+pizza_toppings_pepperoni_price);
	}
	if(pizza_toppings_sausage.equals("Y") || pizza_toppings_sausage.equals("y") ) {
		pizza_toppings_sausage_price=1.25;
		System.out.println("Sausage                            $"+pizza_toppings_pepperoni_price);
	}
    if(pizza_toppings_onion.equals("Y") || pizza_toppings_onion.equals("y") ) {
		pizza_toppings_onion_price=1.25;
		System.out.println("Onion                              $"+pizza_toppings_pepperoni_price);
	}
	
	if(pizza_toppings_mushroom.equals("Y") || pizza_toppings_mushroom.equals("y") ) {
		pizza_toppings_mushroom_price=1.25;
		System.out.println("Mushroom                           $"+pizza_toppings_mushroom_price);
	}
	   
	/*               Formulas with final console output                            */
		subtotal_amount= pizza_size_cost + pizza_toppings_pepperoni_price+ pizza_toppings_sausage_price + pizza_toppings_onion_price + pizza_toppings_mushroom_price;
	    subtotal_amount_tax= subtotal_amount*tax;
	    subtotal_amount_after_tax= subtotal_amount_tax + pizza_size_cost + pizza_toppings_pepperoni_price+ pizza_toppings_sausage_price + pizza_toppings_onion_price + pizza_toppings_mushroom_price;
	    DecimalFormat df= new DecimalFormat(".00");
	    System.out.println("The subtotal cost of your order :  $" + df.format(subtotal_amount));
	    System.out.println("The tax is:                        $"+df.format(subtotal_amount_tax));
	    System.out.println("                                   ------");
	    System.out.println("Total is                           $"+df.format(subtotal_amount_after_tax) );
	}

}
