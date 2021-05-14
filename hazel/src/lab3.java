import javax.swing.JOptionPane;
public class lab3 {
public static void main(String[] args) {
double year_to_month;
double
years=Double.parseDouble(JOptionPane.showInputDialog("How many years "));
double monthly_payment=
Double.parseDouble(JOptionPane.showInputDialog("Amount of a monthly mortgage payment "));
double owed_amount=
Double.parseDouble(JOptionPane.showInputDialog("The amount still owed "));
double rate= 3.38/100;
year_to_month=years*12;
double total_interest= owed_amount*rate*years;
double total_interst_month= total_interest/year_to_month;
double total_principal_interest= monthly_payment-
total_interst_month;
System.out.println("The amount of the payment that goesto interest "+ total_interst_month);
System.out.println("The amount that goes to principal : "+ total_principal_interest );
}
}