package lab;
import java.util.Scanner;
public class well {
public static void main(String[] args) {
Scanner input= new Scanner(System.in);
double radius_input, depth,cube;
System.out.println("Please Enter Radius in inches");
radius_input=input.nextDouble();
System.out.println("Please Enter Depth ");
depth=input.nextDouble();
double total_volume=
3.14*radius_input*radius_input*depth;
cube= total_volume*7.48;
if (cube>300) {
System.out.println(cube+ " gallons are enough for family of four people so, you do not need seprate tank");
}
else {
System.out.println(cube+ " gallons are not enough for family of four people so, you do need seprate tank");
}
}
}
