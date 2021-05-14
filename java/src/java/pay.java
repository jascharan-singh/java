package java;
import javax.swing.JOptionPane;
public class pay{

	public static void main(String[] args) {
	double hours;
	double overtime;
	double hours_pay;
	double hours_pay_overTime;
	double total_under40;
	double total_over40;
	double overtime_hour_pay;
	hours= Double.parseDouble(JOptionPane.showInputDialog("How ManyHours Did you work?"));
	hours_pay= Double.parseDouble(JOptionPane.showInputDialog("How Much Are You Paid Per Hour?"));
	if(hours<=40) {
		total_under40= hours*hours_pay;
		System.out.println("You Earned $"+ total_under40);
	}
	if (hours>40) {
		overtime= hours-40;
		hours_pay_overTime=hours_pay+hours_pay/2;
		overtime_hour_pay=overtime*hours_pay_overTime;
		total_over40= 40* hours_pay+overtime_hour_pay;
		System.out.println("You Earned $"+ total_over40);
		
		
		
	}
		
	}

}
