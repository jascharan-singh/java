import java.util.Scanner;
public class SenamticError {
	public static void main(String[] args)
	{
		int height=0,width=0,depth=0;
		System.out.println("Enter the height, width, and depth of");
		System.out.println("s box and i will compute the volume.");
		Scanner keyword= new Scanner(System.in);
		height=keyword.nextInt();
		width=keyword.nextInt();
		depth=keyword.nextInt();
		int volume=height*width*depth;
		System.out.println("The volume is " + volume);
	}
	
}
