import java.util.Scanner;


public class conversion
{	
	public static void main(String[] args)
	{	
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a distance in meters");
        double meters = reader.nextDouble();
        System.out.println();

        System.out.println("1. Convert to kilometers");
        System.out.println("2. Convert to inches");
        System.out.println("3. Convert to feet");
        System.out.println("4. Quit the program");

	}
	
	public static void showKilometers(double meters)
	{	
        double kilometers = meters * .001;
        System.out.println(meters + " meters is " + kilometers + " kilometers");
	}
	
	public static void falseSwap(int x, int y)
	{	System.out.println("in method falseSwap. x: " + x + " y: " + y);
		int temp = x;
		x = y;
		y = temp;
		System.out.println("in method falseSwap. x: " + x + " y: " + y);
	}
	
	public static void moreParameters(int a, int b)
	{	System.out.println("in method moreParameters. a: " + a + " b: " + b);
		a = a * b;
		b = 12;
		System.out.println("in method moreParameters. a: " + a + " b: " + b);
		falseSwap(b,a);
		System.out.println("in method moreParameters. a: " + a + " b: " + b);	
	}
}