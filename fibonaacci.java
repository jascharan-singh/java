import java.util.Scanner;

public class fibonaacci {

	public static void main(String[] args) {
		System.out.println("How many Fibonacci number do you want to use?");
		System.out.println("Enter a postive integer");
		Scanner keyboard= new Scanner(System.in);
		int number= keyboard.nextInt();
		System.out.println("Here is the Fibonacci series and ratio"
				+ "of current to previous number for "+ number + " Fibonacci numbers:");
		
		double j=0;
		double x=0;
		double d=1;
		
		System.out.println("Fibonacci#1 = 0");
		System.out.println("Fibonacci#2 = 1");
		
		for(int i=3;i<=number;i++) {
			
			j=x+d;
			double t=j/d;
			System.out.println("Fibonacci#"+i+ " = "+j+ " and ratio = " + j +"/"+ d+" = "+ t );
			x=d;
			d=j;
			if (i>number) {
				break;
			}
			
		}
		

	}

}
