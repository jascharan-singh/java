package java;


import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner keywoard=new Scanner(System.in);
		System.out.print("Enter your weight in pounds: ");
		double weight= keywoard.nextDouble();
		System.out.print("Enter your height in feet followed by a space then additional inches: ");
		double feet= keywoard.nextDouble();
		double inches= keywoard.nextDouble();
		double feets_inches= (feet*12)+inches;
		double bmi_height=feets_inches*feets_inches;
		double bmi_calculation= (weight/bmi_height)*703;
		System.out.println(bmi_calculation);
		if (bmi_calculation<18.5) {
			System.out.println("Your risk category is Underweight");
		}
		if (bmi_calculation>=18.5 && bmi_calculation<25) {
			System.out.println("Your category is Normal Weight");
		}
		if (bmi_calculation>=25 && bmi_calculation<30) {
			System.out.println("Your risk category is OverWeight");
		}
		if (bmi_calculation>=30) {
			System.out.println("Your risk category is Obese.");
		}
	}

}
